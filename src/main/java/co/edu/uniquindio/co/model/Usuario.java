package co.edu.uniquindio.co.model;

import java.util.ArrayList;

public class Usuario {

    //Declarar atributos

    private String nombre;
    private byte edad;
    private String documento;
    private String telefono;
    private float peso;
    private String membresia;

    //Lista de reservas que el usuario puede ver que ha hecho (arraylist debido a que no tiene un tamaño especifico y puede seguir creciendo

    private ArrayList<Reserva> listaReservas;

    //Constructor
    //Inicializar los atributos

    public Usuario(String nombre, byte edad, String documento, String telefono, float peso, String membresia){

        this.nombre = nombre;
        this.edad = edad;
        this.documento = documento;
        this.telefono = telefono;
        this.peso = peso;
        this.membresia = membresia;
        listaReservas = new ArrayList<>();
    }

    //Set y Get

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(byte edad){
        this.edad = edad;
    }
    public byte getEdad(){
        return edad;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
    public String getDocumento(){
        return documento;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getPeso(){
        return peso;
    }
    public void setMembresia(String membresia){
        this.membresia = membresia;
    }
    public String getMembresia(){
        return membresia;
    }
    public void setListaReservas(ArrayList listaReservas){
        this.listaReservas = listaReservas;
    }
    public ArrayList<Reserva> getListaReservas(){
        return listaReservas;
    }

    //Metodos

}
