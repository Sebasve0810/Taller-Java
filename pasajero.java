package com.javeriana.edu.taller;

public class Vuelo{
    
    //Atributos
    private String nombres;
    private String apellidos;
    private String numerodepasaporte;
    private String asiento;
    private int edad;
    
    //Metodos
    
    //Constructor por defecto
    Pasajero() {}
    
    //Constructor con parametros
    Pasajero(String nombres, String apellidos, String numerodepasaporte, String asiento, int edad){
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.numerodepasaporte=numerodepasaporte;
        this.asiento=asiento;
        this.edad=edad;
    }
    //Getters y setters
    //Getters
    public String getNombres (){
        return this.nombres;
    }
    public String getApellidos (){
        return this.apellidos;
    }
    public String getNumerodepasaporte (){
        return this.numerodepasaporte;
    }
    public String getAsiento (){
        return this.asiento;
    }
    public int getEdad (){
        return this.edad;
    }
    
    //Setters
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public void setNumerodepasaporte(String nuerodepasaporte){
        this.numerodepasaporte=numerodepasaporte;
    }
    public void setAsiento(String asiento){
        this.asiento=asiento;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
}