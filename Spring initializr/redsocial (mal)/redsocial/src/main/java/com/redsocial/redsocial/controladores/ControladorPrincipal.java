package com.redsocial.redsocial.controladores;

import com.redsocial.redsocial.modelo.Publicaciones;
import com.redsocial.redsocial.modelo.Usuario;
import com.redsocial.redsocial.servicios.ServicioPublicaciones;
import com.redsocial.redsocial.servicios.ServicioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ControladorPrincipal {
    @Autowired
    ServicioUsuarios servicioUsuarios;

    @Autowired
    ServicioPublicaciones servicioPublicaciones;

    @RequestMapping("/")
    public String inicio(Model model){
        List<Usuario> lista=servicioUsuarios.findAll();
        model.addAttribute("lista", lista);

        List<Publicaciones> listaPublicaciones=servicioPublicaciones.findAll();
        model.addAttribute("listaPublicaciones", listaPublicaciones);

        return "index";
    }

/*
    @RequestMapping("/")
    public String inicio(Model model){
        return "index";
    }
*/
    @RequestMapping("/acercade")
    public String acercade(Model model){
        return "acercade";
    }

    @GetMapping("/mostrar/{id}")
    public String mostrar(@PathVariable long id, Model model){
        Usuario aux=servicioUsuarios.findById(id);
        List<Publicaciones> listaPublicaciones=servicioPublicaciones.findByUsuario(aux);
        model.addAttribute("listaPublicaciones", listaPublicaciones);
        model.addAttribute("usuario", aux);
        return "mostrar";
    }
}
