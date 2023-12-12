package com.redsocial.redsocial.repositorios;

import com.redsocial.redsocial.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioUsuarios extends CrudRepository<Usuario, Long> {
    List<Usuario> findAll();
    Usuario findById(long id);
}
