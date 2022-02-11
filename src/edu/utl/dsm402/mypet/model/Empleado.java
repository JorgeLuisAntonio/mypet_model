/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utl.dsm402.mypet.model;

import java.util.Date;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Usuario
 */
public class Empleado {
    private int idEmpleado;
    private Persona persona;
    private String correo;
    private String contrasenia;
    private String token;
    
    public Empleado(){}

    

    public Empleado(Persona persona, String correo, String contrasenia) {
        this.persona = persona;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public Empleado(int idEmpleado, Persona persona, String correo, String contrasenia) {
        this.idEmpleado = idEmpleado;
        this.persona = persona;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public String getToken() {
        return token;
    }

    public String setToken() {
       String u=this.getCorreo();
       String p=this.getContrasenia();
       String k=new Date().toString();
       String x=(DigestUtils.sha256Hex(u+";"+p+";"+k));
       return this.token=x;
    }
@Override
public String toString(){
    return "Usuario{"+"usuario="+correo+", password="+ contrasenia +", token="+token;
}

public boolean validar(String token)
{
    boolean validacion;
    if(this.setToken().equals(token)){
        validacion=true;
    } else {
        validacion=false;
    }
    return validacion;
}

    
}
