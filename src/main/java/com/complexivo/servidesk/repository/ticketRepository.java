/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import com.complexivo.servidesk.models.ticket;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
/**
 *
 * @author AlexanderGuzman
 */
@Repository
public interface ticketRepository extends JpaRepository<ticket, Long>{
    @Query(value = "SELECT * FROM ticket WHERE cod_tecnico=:codTecnico", nativeQuery = true)
    List<ticket> ticketecnico(Long codTecnico);
    public List<ticket> findByCodticket(Long id);
}
