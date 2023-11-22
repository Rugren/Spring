package com.example.redsocial.servicios;

import com.example.redsocial.modelo.Usuario;
import com.example.redsocial.repositorios.RepositorioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioUsuarios {
    @Autowired
    private RepositorioUsuarios repositorioUsuarios;

    public List<Usuario> findAll(){
        return repositorioUsuarios.findAll();
    }
    public Usuario findById(long id){
        return repositorioUsuarios.findById(id);
    }
}
