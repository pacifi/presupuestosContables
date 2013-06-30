/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.omg.PortableServer.REQUEST_PROCESSING_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.ModelosPresupuestoVenta;
import ppm.contable.proyecto.modelo.PpmProducto;
import ppm.contable.proyecto.modelo.PpmPronosticoVenta;
import ppm.contable.proyecto.servicio.ProductoServicio;
import ppm.contable.proyecto.servicio.PronosticoVentaServicio;

/**
 *
 * @author Pacifi
 */
@Controller
public class PVentasController {

    @Autowired
    public ProductoServicio productoServicio;
    @Autowired
    public PronosticoVentaServicio pvs;

    @RequestMapping(value = "presupuestoVentas", method = RequestMethod.GET)
    public ModelAndView Presupuesto() {
        //precio unitario aca cambiar el precio por un dato que me retorne desde costo mas porcentaje de utilidad
        int precio = 100;

        //este id debe venir de una session
        int idProyecto = 2;
        int idProducto;
        int pronosticoVentas;
        Double margenGanancia;
        Double precioUnitario;
        Double presupuestoVenta;
        Double total = 0.0;
        //aca estamos retornando la cantidad de productos que tiene un proyecto;
        List<PpmProducto> listaProducto = productoServicio.listarProductodeProyecto(idProyecto);
        ModelosPresupuestoVenta venta;
        List<ModelosPresupuestoVenta> lisr = new ArrayList();

        for (int j = 0; j < listaProducto.size(); j++) {
            idProducto = listaProducto.get(j).getIdProducto();

            for (int i = 0; i < 12; i++) {
                pronosticoVentas = pvs.listaPronosticoVentasProducto(idProducto).get(i).getUnidadesVenta();
                margenGanancia = (Double.parseDouble(String.valueOf(productoServicio.buscarProductoId(idProducto).getMargenGanancia())) / 100) + 1;
                precioUnitario = margenGanancia * precio;
                presupuestoVenta = precioUnitario * pronosticoVentas;
                total = total + presupuestoVenta;
                venta = new ModelosPresupuestoVenta();
                venta.setMeses(pvs.listaPronosticoVenta().get(i).getIdMeses().getNombreMes());
                venta.setPresupuesto(presupuestoVenta);
                venta.setNombreProducto(productoServicio.buscarProductoId(idProducto).getNombreProducto());
                venta.setTotal(total);
                lisr.add(venta);

            }


        }

        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaPresupuesto", lisr);
        modelo.put("listaProducto", listaProducto);




        return new ModelAndView("contable/presupuestos/presupuestoVentas", modelo);
    }
}
