package co.edu.uniquindio.co.model;

import java.util.ArrayList;

public class Gymnasio {
    private String nombre;
    private String codigoGym;
    private String direccion;
    private String telefono;

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Entrenador> listaEntrenadores;

    // Constructor
    public Gymnasio(String nombre, String codigoGym, String direccion, String telefono) {
        this.nombre = nombre;
        this.codigoGym = codigoGym;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaUsuarios = new ArrayList<>();
        this.listaEntrenadores = new ArrayList<>();
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getCodigoGym() { return codigoGym; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCodigoGym(String codigoGym) { this.codigoGym = codigoGym; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String registrarEntrenador(String nombre, String edad, String documento,
                                      String telefono, String especialidad, byte añosDeExperiencia) {
        Entrenador buscado = buscarEntrenador(documento);
        if (buscado != null) {
            return "Error: el entrenador que desea registrar ya se encuentra registrado";
        }
        Entrenador entrenadorNuevo = new Entrenador(nombre, documento, edad, telefono, especialidad, añosDeExperiencia);
        listaEntrenadores.add(entrenadorNuevo);
        return "Entrenador registrado con éxito";
    }
}