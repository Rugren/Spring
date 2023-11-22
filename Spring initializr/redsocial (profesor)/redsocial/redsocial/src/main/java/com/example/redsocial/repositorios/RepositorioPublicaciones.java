package com.example.redsocial.repositorios;

import com.example.redsocial.modelo.Publicacion;
import com.example.redsocial.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioPublicaciones extends CrudRepository<Publicacion, Long> {
    List<Publicacion> findAll();
    public List<Publicacion> findByUsuario(Usuario usuario);
}
