package com.proyecto.apiCursoSena.controller;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.apiCursoSena.service.LocalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.proyecto.apiCursoSena.entity.local;



import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("api/local")
public class LocalController {

    @Autowired
    LocalService localService;
    

    @GetMapping("/findAll")
    public List<local> findAll(){
        return localService.findAll();
    }
    
    

    
}


