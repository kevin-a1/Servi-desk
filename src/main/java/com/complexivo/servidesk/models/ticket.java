/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.complexivo.servidesk.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne; 
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
/**
 *
 * @author AlexanderGuzman
 */
@Entity
@Table(name = "ticket")
public class ticket {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codticket;

    private Date fechaAsignacion;
    


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaCreacion")
    @DateTimeFormat(pattern = "YYYY-MM-DDThh:mm:ssTZD")
    private Date fechaCreacion;
    private double sla;

    @OneToOne
    @JoinColumn(name = "codUsuario", updatable = false, nullable = false, referencedColumnName = "codUsuario")
    private usuario usuario;

    // @OneToOne
    // @JoinColumn(name = "email", updatable = false, nullable = false, referencedColumnName = "email")
    // private usuario usuario;

//    @OneToOne
//    @JoinColumn(name = "codCoordinador", updatable = false, nullable = false, referencedColumnName = "codCoordinador")
//    private coordinador coordinador;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codViaComunicacion", updatable = false, nullable = false, referencedColumnName = "codViaComunicacion")
    private viaComunicacion viaComunicacion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codServicio", updatable = false, nullable = false, referencedColumnName = "codServicio")
    private servicio servicio;

    @OneToOne
    @JoinColumn(name = "codSolucion", updatable = false,  referencedColumnName = "codSolucion")
    private solucion solucion;

    @OneToOne
    @JoinColumn(name = "codTecnico", updatable = false,  referencedColumnName = "codTecnico")
    private tecnico tecnico;

    @OneToOne
    @JoinColumn(name = "codEstado", updatable = false , referencedColumnName = "codEstado")
    private estado estado;

    public ticket() {
    }


    public estado getEstado() {
        return estado;
    }


    public void setEstado(estado estado) {
        this.estado = estado;
    }


    
    public viaComunicacion getViaComunicacion() {
        return this.viaComunicacion;
    }

    public void setViaComunicacion(viaComunicacion viaComunicacion) {
        this.viaComunicacion = viaComunicacion;
    }

    public tecnico getTecnico() {
        return this.tecnico;
    }

    public void setTecnico(tecnico tecnico) {
        this.tecnico = tecnico;
    }



    public usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }


    public servicio getServicio() {
        return this.servicio;
    }

    public void setServicio(servicio servicio) {
        this.servicio = servicio;
    }

    public solucion getSolucion() {
        return this.solucion;
    }

    public void setSolucion(solucion solucion) {
        this.solucion = solucion;
    }


    public Long getCodticket() {
        return codticket;
    }

    public void setCodticket(Long codticket) {
        this.codticket = codticket;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

   
    public double getSla() {
        return this.sla;
    }

    public void setSla(double sla) {
        this.sla = sla;
    }

 
}
