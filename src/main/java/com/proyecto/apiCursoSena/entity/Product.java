package com.proyecto.apiCursoSena.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name = "tbl_products")
@Data

public class Product {

    @Id


    private Long idProduct;
    private String name;
    private String brand;
    private Boolean expired;
    private Float price;

    @ManyToOne
    @JoinColumn(
           name = "id",
           referencedColumnName = "id_local"
    )

    private local local;



    
}
