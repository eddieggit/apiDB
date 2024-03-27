package com.proyecto.apiCursoSena.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.apiCursoSena.entity.Product;



@Repository


public interface ProductRepository extends JpaRepository<Product,Long> {

    
    
}
