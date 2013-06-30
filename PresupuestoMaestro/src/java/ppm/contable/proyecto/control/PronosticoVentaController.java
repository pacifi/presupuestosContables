/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ppm.contable.proyecto.modelo.PpmPronosticoVenta;
import ppm.contable.proyecto.servicio.MesesServicio;
import ppm.contable.proyecto.servicio.ProductoServicio;
import ppm.contable.proyecto.servicio.PronosticoVentaServicio;

/**
 *
 * @author Pacifi
 */
@Controller
public class PronosticoVentaController {

    @Autowired
    public PronosticoVentaServicio servicio;
    @Autowired
 
    public ProductoServicio productoServicio;
    @Autowired
    public MesesServicio mesesServicio;

    @RequestMapping(value = "reportePronostico", method = RequestMethod.GET)
    public ModelAndView irReporte() {
        List<PpmPronosticoVenta> lista = servicio.listaPronosticoVenta();
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaPronostico", lista);
        return new ModelAndView("contable/mantenimiento/pronosticoVenta/pronosticoList", modelo);
    }

    @RequestMapping(value = "formPronosticogoInsert")
    public ModelAndView irFormulario(@ModelAttribute("ModeloPronostico") PpmPronosticoVenta pronosticoVenta, BindingResult result) {

        return new ModelAndView("contable/mantenimiento/pronosticoVenta/pronosticoInsert");
    }

    @RequestMapping(value = "pronosticoGuardar", method = RequestMethod.POST)
    public ModelAndView guardar(@ModelAttribute("ModeloPronostico") PpmPronosticoVenta pronosticoVenta, BindingResult result, HttpServletRequest request) {
        PpmPronosticoVenta ppv= new PpmPronosticoVenta();
      
        
        
        int idProducto = Integer.parseInt(String.valueOf(request.getParameter("codigo") == null ? "" : request.getParameter("codigo")));
        int enero = Integer.parseInt(String.valueOf(request.getParameter("enero") == null ? "" : request.getParameter("enero")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(1));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(enero);
        servicio.insertaPronosticoVenta(ppv);
        int febrero = Integer.parseInt(String.valueOf(request.getParameter("febrero") == null ? "" : request.getParameter("febrero")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(2));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(febrero);
        servicio.insertaPronosticoVenta(ppv);

        int marzo = Integer.parseInt(String.valueOf(request.getParameter("marzo") == null ? "" : request.getParameter("marzo")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(3));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(marzo);
        servicio.insertaPronosticoVenta(ppv);

        int abril = Integer.parseInt(String.valueOf(request.getParameter("abril") == null ? "" : request.getParameter("abril")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(4));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(abril);
        servicio.insertaPronosticoVenta(ppv);

        int mayo = Integer.parseInt(String.valueOf(request.getParameter("mayo") == null ? "" : request.getParameter("mayo")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(5));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(mayo);
        servicio.insertaPronosticoVenta(ppv);

        int junio = Integer.parseInt(String.valueOf(request.getParameter("junio") == null ? "" : request.getParameter("junio")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(6));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(junio);
        servicio.insertaPronosticoVenta(ppv);

        int julio = Integer.parseInt(String.valueOf(request.getParameter("julio") == null ? "" : request.getParameter("julio")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(7));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(julio);
        servicio.insertaPronosticoVenta(ppv);

        int agosto = Integer.parseInt(String.valueOf(request.getParameter("agosto") == null ? "" : request.getParameter("agosto")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(8));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(agosto);
        servicio.insertaPronosticoVenta(ppv);

        int setiembre = Integer.parseInt(String.valueOf(request.getParameter("setiembre") == null ? "" : request.getParameter("setiembre")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(9));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(setiembre);
        servicio.insertaPronosticoVenta(ppv);

        int octubre = Integer.parseInt(String.valueOf(request.getParameter("octubre") == null ? "" : request.getParameter("octubre")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(10));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(octubre);
        servicio.insertaPronosticoVenta(ppv);

        int noviembre = Integer.parseInt(String.valueOf(request.getParameter("noviembre") == null ? "" : request.getParameter("noviembre")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(11));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(noviembre);
        servicio.insertaPronosticoVenta(ppv);

        int diciembre = Integer.parseInt(String.valueOf(request.getParameter("diciembre") == null ? "" : request.getParameter("diciembre")));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setIdMeses(mesesServicio.buscarIdMeses(12));
        ppv.setIdProducto(productoServicio.buscarProductoId(idProducto));
        ppv.setUnidadesVenta(diciembre);
        servicio.insertaPronosticoVenta(ppv);

        return new ModelAndView("redirect:reportePronostico.pacifi");
    }

    @RequestMapping(value = "eliminarPronostico", method = RequestMethod.GET)
    public ModelAndView eliminarProducto(HttpServletRequest request) {
        int idProducto = Integer.parseInt(request.getParameter("idPCon") == null ? "" : request.getParameter("idPCon"));
        System.out.println("aca el id" + idProducto);
        servicio.eliminarPronosticoVenta(idProducto);
        return new ModelAndView("redirect:reportePronostico.pacifi");
    }
}
