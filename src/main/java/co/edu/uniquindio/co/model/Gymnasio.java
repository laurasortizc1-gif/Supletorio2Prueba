package co.edu.uniquindio.co.model;

import java.util.ArrayList;

public class Gymnasio {
    private String nombre;
    private String codigoGym;
    private String direccion;
    private String telefono;

    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Entrenador> listaEntrenadores;
    private ArrayList<Maquina> listaMaquinas;
    private ArrayList<Reserva> listaReservas;

    // Constructor
    public Gymnasio(String nombre, String codigoGym, String direccion, String telefono) {
        this.nombre = nombre;
        this.codigoGym = codigoGym;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaUsuarios = new ArrayList<>();
        this.listaEntrenadores = new ArrayList<>();
        this.listaMaquinas = new ArrayList<>();

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

    public String registrarEntrenador(String nombre, byte edad, String documento,
                                      String telefono, String especialidad, byte añosDeExperiencia) {
        Entrenador buscado = buscarEntrenador(documento);
        if (buscado != null) {
            return "Error: el entrenador que desea registrar ya se encuentra registrado";
        }
        Entrenador entrenadorNuevo = new Entrenador(nombre, edad, documento, telefono,especialidad, añosDeExperiencia);
        listaEntrenadores.add(entrenadorNuevo);
        return "Entrenador registrado con éxito";
    }
    public Entrenador buscarEntrenador (String documento) {
        for (Entrenador aux : listaEntrenadores) {
            if (aux.getDocumento().equals(documento)) {
                return aux;
            }
        }
        return null;
    }
    public Entrenador consultarEntrenador(String nombreEntrenador){
        for (Entrenador entrenadorAux : listaEntrenadores){
            if( entrenadorAux != null && entrenadorAux.getNombre().equals(nombreEntrenador)){
                return entrenadorAux;
            }
        }
        return null;
    }
    public String registrarUsuario(String nombre, byte edad, String documento,
                                      String telefono,float peso , String membresia) {
        Usuario buscado = buscarUsuario(documento);
        if (buscado != null) {
            return "Error: el usuario que desea registrar ya se encuentra registrado";
        }
        Usuario usuarioNuevo = new Usuario(nombre, edad, documento, telefono, peso, membresia);
        listaUsuarios.add(usuarioNuevo);
        return "Usuario registrado con éxito";
    }
    public Usuario buscarUsuario (String documento) {
        for (Usuario aux : listaUsuarios) {
            if (aux.getDocumento().equals(documento)) {
                return aux;
            }
        }
        return null;
    }
    public Usuario consultarUsuario(String nombreUsuario){
        for (Usuario usuarioAux : listaUsuarios){
            if( usuarioAux != null && usuarioAux.getNombre().equals(nombreUsuario)){
                return usuarioAux;
            }
        }
        return null;
    }
    public String registrarMaquina(String codigo, String nombre, String tipo, String zona, String estado, float valorMantenimiento) {
        Maquina buscado = buscarMaquina(codigo);
        if (buscado != null) {
            return "Error: La maquina que desea registrar ya se encuentra registrada";
        }
        Maquina maquinaNueva = new Maquina(codigo, nombre, tipo, zona, estado, valorMantenimiento);
        listaMaquinas.add(maquinaNueva);
        return "Usuario registrado con éxito";
    }
    public Maquina buscarMaquina (String codigo) {
        for (Maquina aux : listaMaquinas) {
            if (aux.getCodigo().equals(codigo)) {
                return aux;
            }
        }
        return null;
    }
    public Maquina consultarMaquina(String codigoMaquina){
        for (Maquina maquinaAux : listaMaquinas){
            if( maquinaAux != null && maquinaAux.getCodigo().equals(codigoMaquina)){
                return maquinaAux;
            }
        }
        return null;
    }
    public String registrarReserva(String codigo, String fecha, String hora, byte duracion, String estado, String tipo, float valor) {
        Reserva buscado = buscarReserva(codigo);
        if (buscado != null) {
            return "Error: la reserva que desea registrar ya se encuentra registrado";
        }
        Reserva reservaNueva = new Reserva(codigo, fecha, hora, duracion, estado, tipo, valor);
        listaReservas.add(reservaNueva);
        return "Usuario registrado con éxito";
    }
    public Reserva buscarReserva (String codigo) {
        for (Reserva aux : listaReservas) {
            if (aux.getCodigo().equals(codigo)) {
                return aux;
            }
        }
        return null;
    }
    public Reserva consultarReserva(String codigoReserva){
        for (Reserva reservaAux : listaReservas){
            if( reservaAux != null && reservaAux.getCodigo().equals(codigoReserva)){
                return reservaAux;
            }
        }
        return null;
    }
}