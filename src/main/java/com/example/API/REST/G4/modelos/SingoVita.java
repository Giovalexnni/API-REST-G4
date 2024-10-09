package com.example.API.REST.G4.modelos;
import jakarta.persistence.*;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;

import java.time.LocalDate;

@Entity
@Table( name= "SignoVitales")

public class SingoVita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombre; // 50 caracteres
    private String valor; // 50 caracteres
    private LocalDate fehchaMedida; // debe ser de 1990 a 2024

    public SingoVita() {
    }

    public SingoVita(Long id, String nombre, String valor, LocalDate fehchaMedida) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.fehchaMedida = fehchaMedida;

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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LocalDate getFehchaMedida() {
        return fehchaMedida;
    }

    public void setFehchaMedida(LocalDate fehchaMedida) {
        this.fehchaMedida = fehchaMedida;
    }
}
