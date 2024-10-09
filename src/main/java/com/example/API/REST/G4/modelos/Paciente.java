package com.example.API.REST.G4.modelos;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name="paccientes ")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; //  no debe tener mas de 40 caracteres// solo admito letras
    private LocalDate anioNacimiento; //este año no puede ser mayor a 2024// que no puede ser menor a 1920
    private String ciduad;// no debe tener ams de 50 caracteres y ademas solo letras
    private String correo;// deebe tener formato @sura .com.co
    private String telefono;//debe tener 10 digitos
    private String ips;
    private Boolean tienePoliza;
    private LocalDate fechaRegistro;// fechas validas enter 1995-2024



    public Paciente() {
    }

    public Paciente(Long id, String nombre, LocalDate anioNacimiento, String ciduad, String correo, String telefono, String ips, Boolean tienePoliza, LocalDate fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.ciduad = ciduad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.tienePoliza = tienePoliza;
        this.fechaRegistro = fechaRegistro;
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

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCiduad() {
        return ciduad;
    }

    public void setCiduad(String ciduad) {
        this.ciduad = ciduad;
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

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
