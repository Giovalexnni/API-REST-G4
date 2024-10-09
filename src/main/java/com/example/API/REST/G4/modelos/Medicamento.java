package com.example.API.REST.G4.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table( name= "Medicamnetos")

public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nombre;
   private String presentacion;
   private Double dosis;
   private String laboratorio;
   private LocalDate fechaCudacidad;
   private String contraindicaciones;
   private String registroInvima;
   private Boolean tieneCopago;

    public Medicamento() {
    }

    public Medicamento(Long id, String nombre, String presentacion, Double dosis, String laboratorio, LocalDate fechaCudacidad, String contraindicaciones, String registroInvima, Boolean tieneCopago) {
        this.id = id;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.dosis = dosis;
        this.laboratorio = laboratorio;
        this.fechaCudacidad = fechaCudacidad;
        this.contraindicaciones = contraindicaciones;
        this.registroInvima = registroInvima;
        this.tieneCopago = tieneCopago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getDosis() {
        return dosis;
    }

    public void setDosis(Double dosis) {
        this.dosis = dosis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaCudacidad() {
        return fechaCudacidad;
    }

    public void setFechaCudacidad(LocalDate fechaCudacidad) {
        this.fechaCudacidad = fechaCudacidad;
    }

    public String getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public String getRegistroInvima() {
        return registroInvima;
    }

    public void setRegistroInvima(String registroInvima) {
        this.registroInvima = registroInvima;
    }

    public Boolean getTieneCopago() {
        return tieneCopago;
    }

    public void setTieneCopago(Boolean tieneCopago) {
        this.tieneCopago = tieneCopago;
    }
}
