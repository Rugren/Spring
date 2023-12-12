package com.redsocial.redsocial.modelo;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Entity
public class Publicaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    Usuario usuario;

    @Column(nullable = false)
    String mensaje;

    @Column(nullable = true)
    String imagen; // Guardamos una url como tipo imagen, en lugar de ser un archivo imagen.

}
