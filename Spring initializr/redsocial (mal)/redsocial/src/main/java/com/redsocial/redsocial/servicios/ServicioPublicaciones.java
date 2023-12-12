package com.redsocial.redsocial.servicios;

import com.redsocial.redsocial.modelo.Publicaciones;
import com.redsocial.redsocial.modelo.Usuario;
import com.redsocial.redsocial.repositorios.RepositorioPublicaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPublicaciones {
    @Autowired
    RepositorioPublicaciones repositorioPublicaciones;

    public List<Publicaciones> findAll(){
        return repositorioPublicaciones.findAll();
    }

    public List<Publicaciones> findByUsuario(Usuario )
}
