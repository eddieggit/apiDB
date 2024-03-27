package com.proyecto.apiCursoSena.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "tbl_local")


public class local {


    @Id
    @Column(name = "id_local")


    private Long id;
    private String name;
    private String floor;
    
}
