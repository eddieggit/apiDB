package com.proyecto.apiCursoSena.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.apiCursoSena.entity.Product;
import com.proyecto.apiCursoSena.repos.ProductRepository;


@Service

public class ProductServiceImpl implements ProductService{

  @Autowired
  ProductRepository repository;

  @Override
  public List<Product> findAll() {
      return repository.findAll();
    }
    
}

