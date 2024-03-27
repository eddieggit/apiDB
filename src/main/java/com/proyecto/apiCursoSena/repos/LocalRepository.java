package com.proyecto.apiCursoSena.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.apiCursoSena.entity.local;

@Repository

public interface LocalRepository extends JpaRepository<local,Long> {

    
}
