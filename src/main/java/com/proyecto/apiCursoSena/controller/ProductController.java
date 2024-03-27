package com.proyecto.apiCursoSena.controller;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.apiCursoSena.service.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.proyecto.apiCursoSena.entity.Product;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("api/Product")
public class ProductController {

    @Autowired
    ProductService ProductService;
    

    @GetMapping("/findAll")
    public List<Product> findAll(){
        return ProductService.findAll();
    }
    
    

    
}
