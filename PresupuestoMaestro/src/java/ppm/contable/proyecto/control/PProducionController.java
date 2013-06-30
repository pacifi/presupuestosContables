/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.ModelosPresupuestoProduccion;
import ppm.contable.proyecto.modelo.ModelosPresupuestoVenta;
import ppm.contable.proyecto.modelo.PpmProducto;
import ppm.contable.proyecto.modelo.PpmPronosticoVenta;
import ppm.contable.proyecto.servicio.ProductoConsumoServicio;
import ppm.contable.proyecto.servicio.ProductoServicio;
import ppm.contable.proyecto.servicio.PronosticoVentaServicio;

/**
 *
 * @author noe
 */
@Controller
public class PProducionController {

    @Autowired
    public PronosticoVentaServicio pvs;
    @Autowired
    public ProductoServicio productoServicio;

    @RequestMapping(value = "presupuestoProduccion", method = RequestMethod.GET)
    public ModelAndView Presupuesto() {
        //el id producto tiene que venir del jsp

        int idProducto = 5;
        int polInvIn = productoServicio.buscarProductoId(idProducto).getInvInicial();
        Double invFinal = 0.0;
        int uniVenta = 0;
        int idProyecto = 2;
        Double invIni = 0.0;
        Double resultado;
        Double polInvFin = Double.parseDouble(String.valueOf(productoServicio.buscarProductoId(idProducto).getPoliticaInvfin())) / 100;
        List<PpmPronosticoVenta> pronosticoVentasList = pvs.listaPronosticoVentasProducto(idProducto);
        ModelosPresupuestoProduccion produccion;
        List<ModelosPresupuestoProduccion> listPro = new ArrayList<ModelosPresupuestoProduccion>();

        List<PpmProducto> listaProducto = productoServicio.listarProductodeProyecto(idProyecto);
        ModelosPresupuestoProduccion lista;
        List<ModelosPresupuestoProduccion> lisr = new ArrayList();

        for (int j = 0; j < listaProducto.size(); j++) {
            idProducto = listaProducto.get(j).getIdProducto();
            for (int i = 0; i < pronosticoVentasList.size(); i++) {

                if (i == 0) {
                    invIni = (double) productoServicio.buscarProductoId(idProducto).getInvInicial();
                }
                invIni = (double) invFinal;
                if (i == 11) {
                    invFinal = (double) productoServicio.buscarProductoId(idProducto).getInvInicial();
                }
                uniVenta = pronosticoVentasList.get(i).getUnidadesVenta();
                if (i < 11) {
                    invFinal = pronosticoVentasList.get(i + 1).getUnidadesVenta() * polInvFin;
                }
                resultado = (double) uniVenta + invFinal - invIni;
                produccion = new ModelosPresupuestoProduccion();
                produccion.setMeses(pronosticoVentasList.get(i).getIdMeses().getNombreMes());
                produccion.setNombreProducto(productoServicio.buscarProductoId(idProducto).getNombreProducto());
                produccion.setProduccionRequerida(resultado);
                listPro.add(produccion);
            }

        }
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaPresupuesto", listPro);
        modelo.put("listaProducto", listaProducto);



        return new ModelAndView("contable/presupuestos/produccion", modelo);
    }
}
