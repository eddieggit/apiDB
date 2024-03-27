package com.proyecto.apiCursoSena.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.apiCursoSena.entity.local;
import com.proyecto.apiCursoSena.repos.LocalRepository;


@Service

public class localserviceImpl implements LocalService{

  @Autowired
  LocalRepository repository;

  @Override
  public List<local> findAll() {
      return repository.findAll();
    }
    
}
