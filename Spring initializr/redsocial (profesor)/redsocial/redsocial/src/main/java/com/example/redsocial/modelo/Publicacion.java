package com.example.redsocial.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    Usuario usuario;

    @Column(nullable = false)
    String mensaje;

    @Column(nullable = true)
    String imagen;

}
