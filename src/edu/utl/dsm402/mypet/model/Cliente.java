
package edu.utl.dsm402.mypet.model;


public class Cliente 
{
    private int idCliente;
    private Persona persona;
    private String correo;
    private String contrasenia;
    
    public Cliente ()
    {
    }

    public Cliente(Persona persona, String correo, String contrasenia) 
    {
        this.persona = persona;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public Cliente(int idCliente, Persona persona, String correo, String contrasenia) 
    {
        this.idCliente = idCliente;
        this.persona = persona;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() 
    {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) 
    {
        this.contrasenia = contrasenia;
    }

    public int getIdCliente() 
    {
        return idCliente;
    }

    public void setIdCliente(int idCliente) 
    {
        this.idCliente = idCliente;
    }

    public Persona getPersona() 
    {
        return persona;
    }

    public void setPersona(Persona persona) 
    {
        this.persona = persona;
    }

    public String getCorreo() 
    {
        return correo;
    }

    public void setCorreo(String correo) 
    {
        this.correo = correo;
    }
    
    

    
}

