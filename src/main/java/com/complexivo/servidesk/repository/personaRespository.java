package com.complexivo.servidesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.complexivo.servidesk.models.persona;

@Repository
public interface personaRespository extends JpaRepository<persona, String> {

    public persona findByCedula(String Cedula);
    
}
