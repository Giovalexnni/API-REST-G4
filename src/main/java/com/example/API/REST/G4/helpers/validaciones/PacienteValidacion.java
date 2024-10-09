package com.example.API.REST.G4.helpers.validaciones;

import com.example.API.REST.G4.modelos.Paciente;
import org.hibernate.boot.BootLogging;

public class PacienteValidacion {
    //inyecccion de depandencias
    //llamar una clase dentro  de otra
    private Paciente paciente = new Paciente();
    //crear un metodo para cada dato que debo de validar
    public Boolean valiadarNombre(){
        return true;
    }
    public Boolean validarFechaNacimiento(){
        return true;
    }
    public Boolean valiadrCiudad(){
        return true;

    }
    public Boolean validarCorreo(){
        return true;

    }
    public Boolean validarTelefono(){
        return true;

    }
    public Boolean validarGrupoIps(){
        return true;

    }
    public Boolean validarFechaAfiliacion(){
        return true;
    }
}
