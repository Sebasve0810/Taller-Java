package com.javeriana.edu.taller;

public class Vuelo{
    
    //Atributos
    private String codigo;
    private String origen;
    private String destino;
    private int disponibilidad;
    private Pasajero pasajero[];
    
    //Metodos
    
    //Constructor por defecto
    Vuelo() {}
    
    
    //Constructor con parametros
    Vuelo(String codigo, String origen, String destino, int disponibilidad, Pasajero pasajero){
        this.codigo=codigo;
        this.origen=origen;
        this.destino=destino;
        this.disponibilidad=disponibilidad;
        this.pasajeros=pasajeros;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    public String getOrigen(){
        return this.origen;
    }
    public String getDestino(){
        return this.destino;
    }
    public int getDisponibilidad(){
        return this.disponibilidad;
    }
    public Pasajero[] getPasajeros(){
        return this.pasajeros;
    }
    
    //Setters
    public void setCodigo(String codigo){
        this.codigo=apellidos;
    }
    public void setOrigen(String origen){
        this.origen=origen;
    }
    public void setDestino(String destino){
        this.destino=destino;
    }
    public void setDisponibilidad(int disponibilidad){
        this.disponibilidad=disponibilidad;
    }
    public void setPasajeros(String pasajeros[]){
        this.pasajeros=pasajeros;
    }
    
}