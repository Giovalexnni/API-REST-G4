package com.example.API.REST.G4.modelos;

import jakarta.persistence.*;

@Entity
@Table ( name= "Enfermedades")

public class Enfermedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;
   private String nombre;
   private String sintomas;
   private String clasificacion;
    private String grado;
    private Double probabilidadVivir;

    public Enfermedad() {
    }

    public Enfermedad(Long id, String nombre, String sintomas, String clasificacion, String grado, Double probabilidadVivir) {
        Id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.clasificacion = clasificacion;
        this.grado = grado;
        this.probabilidadVivir = probabilidadVivir;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Double getProbabilidadVivir() {
        return probabilidadVivir;
    }

    public void setProbabilidadVivir(Double probabilidadVivir) {
        this.probabilidadVivir = probabilidadVivir;
    }
}
