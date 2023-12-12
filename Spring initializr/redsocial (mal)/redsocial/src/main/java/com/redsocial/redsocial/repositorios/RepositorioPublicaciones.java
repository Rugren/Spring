package com.redsocial.redsocial.repositorios;

import com.redsocial.redsocial.modelo.Publicaciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioPublicaciones extends CrudRepository<Publicaciones, Long> {

    public List<Publicaciones> findByUsuario(Usuario usuario) {
    }

}
