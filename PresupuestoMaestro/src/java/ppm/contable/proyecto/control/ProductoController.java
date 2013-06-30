/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm.contable.proyecto.control;

import java.util.ArrayList;
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
import ppm.contable.proyecto.modelo.PpmProducto;
import ppm.contable.proyecto.modelo.PpmProyecto;
import ppm.contable.proyecto.servicio.ProductoServicio;
import ppm.contable.proyecto.servicio.ProyectoServicio;

@Controller
public class ProductoController {

    @Autowired
    public ProductoServicio servicio;
    @Autowired
    public ProyectoServicio proyectoServicio;
    @RequestMapping(value = "reporteProducto", method = RequestMethod.GET)
     public ModelAndView irReporte() {

     List<PpmProducto> lista = servicio.listarProducto();
     Map<String, Object> modelo = new HashMap<String, Object>();
     modelo.put("listaProducto", lista);

     return new ModelAndView("contable/mantenimiento/producto/productoList", modelo);

     }

    @RequestMapping(value = "irProductoProyecto", method = RequestMethod.GET)
    public ModelAndView irReporte(HttpServletRequest request) {

        int idProyecto = Integer.parseInt(request.getParameter("idProyecto") == null ? "" : request.getParameter("idProyecto"));
        String nombreproyecto = request.getParameter("nombreProyecto") == null ? "" : request.getParameter("nombreProyecto");
        String nombreempresa = request.getParameter("nombreEmpresa") == null ? "" : request.getParameter("nombreEmpresa");
        PpmProyecto ppmProyecto = new PpmProyecto();
        List<PpmProyecto> listaProyecto = new ArrayList<PpmProyecto>();
        ppmProyecto.setNombreEmpresa(nombreempresa);
        ppmProyecto.setNombrePresupuestos(nombreproyecto);
        ppmProyecto.setIdProyecto(idProyecto);
        listaProyecto.add(ppmProyecto);
        
        
        request.getSession().setAttribute("NProyecto", listaProyecto);

        List<PpmProducto> lista = servicio.listarProductodeProyecto(idProyecto);
        Map<String, Object> modelo = new HashMap<String, Object>();
        modelo.put("listaProducto", lista);
        return new ModelAndView("contable/mantenimiento/producto/productoList", modelo);

    }

    @RequestMapping(value = "formProducto", method = RequestMethod.GET)
    public ModelAndView irFormulario(@ModelAttribute("ModeloProducto") PpmProducto producto, BindingResult result) {
        return new ModelAndView("contable/mantenimiento/producto/productoInsert");
    }

    @RequestMapping(value = "productoGuardar", method = RequestMethod.POST)
    public ModelAndView guardarProducto(@ModelAttribute("ModeloProducto") PpmProducto producto, BindingResult result) {
        servicio.insertaPeriodo(producto);
        return new ModelAndView("redirect:reporteProducto.pacifi");
    }

    @RequestMapping(value = "eliminarProducto", method = RequestMethod.GET)
    public ModelAndView eliminarProducto(HttpServletRequest request) {
        int idProducto = Integer.parseInt(request.getParameter("idProductoP") == null ? "" : request.getParameter("idProductoP"));
        servicio.eliminarProducto(idProducto);
        return new ModelAndView("redirect:reporteProducto.pacifi");
    }
    /*Editar Periodo*/

    @RequestMapping(value = "editarProductoForm", method = RequestMethod.GET)
    public ModelAndView formEditProducto(HttpServletRequest request) {

        int idProducto = Integer.parseInt(request.getParameter("idProductoP") == null ? "" : request.getParameter("idProductoP"));

        PpmProducto producto = null;
        producto = servicio.buscarProductoId(idProducto);

        return new ModelAndView("contable/mantenimiento/producto/productoEdit", "ActualizarModelo", producto);
    }

    @RequestMapping(value = "productoActualizar", method = RequestMethod.POST)
    public ModelAndView actualizarProducto(@ModelAttribute("ActualizarModelo") PpmProducto producto, BindingResult result) {
        servicio.actualizarProducto(producto);
        return new ModelAndView("redirect:reporteProducto.pacifi");
    }
}