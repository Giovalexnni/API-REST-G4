package com.example.API.REST.G4.modelos;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table( name= "Medicos")

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; // 50 caracteres y solo letras
    private String matricula;// 20 caracteres
    private String especialidad;// 50 carateres
    private Integer salario;// no peuede ser negativo //minimo 8000000 // 30000000
    private String ips;//50 caracteres
    private String correo;// @sura.com.co
    private String telefono;// 10 caracteres
    private String direccion;// 100 caracteres
    private Boolean estaDisponobleFindesemana;

    public Medico() {
  }

    public Medico(Long id, String nombre, String matricula, String especialidad, Integer salario, String ips, String correo, String telefono, String direccion, Boolean estaDisponobleFindesemana) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estaDisponobleFindesemana = estaDisponobleFindesemana;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstaDisponobleFindesemana() {
        return estaDisponobleFindesemana;
    }

    public void setEstaDisponobleFindesemana(Boolean estaDisponobleFindesemana) {
        this.estaDisponobleFindesemana = estaDisponobleFindesemana;
    }
}
