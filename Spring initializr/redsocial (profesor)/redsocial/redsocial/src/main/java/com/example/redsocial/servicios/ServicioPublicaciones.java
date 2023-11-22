package com.example.redsocial.servicios;

import com.example.redsocial.modelo.Publicacion;
import com.example.redsocial.modelo.Usuario;
import com.example.redsocial.repositorios.RepositorioPublicaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPublicaciones {
    @Autowired
    RepositorioPublicaciones repositorioPublicaciones;

    public List<Publicacion> findAll(){
        return repositorioPublicaciones.findAll();
    }

    public List<Publicacion> findByUsuario(Usuario usuario){
        return repositorioPublicaciones.findByUsuario(usuario);
    }
}
