package co.edu.uniquindio.co.model;

import java.util.ArrayList;

public class Gymnasio {
    private String nombre;
    private String codigo;
    private String direccion;
    private String telefono;

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Entrenador> listaEntrenadores;

    public Gymnasio (String nombre, String codigo, String direccion, String telefono){
        this.nombre = nombre;
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        listaUsuarios = new ArrayList<>();
        listaEntrenadores = new ArrayList<>();
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCodigo(){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setDireccion(){
        this.direccion = direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setTelefono(){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }

    public String registrarEntrenador(String nombre,String edad, String documento, String telefono, String especialidad, byte añosDeExperiencia){
        String mensaje = "";
        Entrenador buscado = buscarEntrenador(documento);
        if(buscado != null){
            return "Error el estudiante que usted desea registra ya se encuentra registrado";
        }else{
            Entrenador entrenadorNuevo = new Entrenador(nombre,documento,edad,telefono, especialidad, añosDeExperiencia);
            listaEntrenadores.add(entrenadorNuevo);
            mensaje = "Estudiante registrado con exito";
        }
        return mensaje;
    }
}
