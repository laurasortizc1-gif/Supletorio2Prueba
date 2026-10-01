package co.edu.uniquindio.co.model;

import java.util.ArrayList;

public class Maquina {

    private String codigo;
    private String nombre;
    private String tipo;
    private String zona;
    private String estado;
    private float valorMantenimiento;

    //relacion
    private Reserva ownedByCurso;
    private ArrayList<Maquina> listaMaquinas;

    //constructor
    public Maquina(String codigo, String nombre, String tipo, String zona, String estado, float valorMantenimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.zona = zona;
        this.estado = estado;
        this.valorMantenimiento = valorMantenimiento;
        this.listaMaquinas = new ArrayList<>();
    }

    //setter//get
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setValorMantenimiento(float valorMantenimiento) {
        this.valorMantenimiento = valorMantenimiento;
    }

    public float getValorMantenimiento() {
        return valorMantenimiento;
    }

    //metodo mostrar
    @Override
    public String toString() {
        return "Maquina{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", zona='" + zona + '\'' +
                ", estado='" + estado + '\'' +
                ", valorMantenimiento=" + valorMantenimiento +
                '}';
    }

    //funcionalidades o metodos
    public Maquina buscarMaquina(String codigo) {
        for (Maquina aux : listaMaquinas) {
            if (aux.getCodigo().equals(codigo)) {
                return aux;
            }
        }
        return null;
    }
 //actualizar estado de la maquina
    public String actualizarEstadoMaquina(String codigo, String nuevoEstado) {
        if (nuevoEstado == null) {
            return "Error: el nuevo estado no es valido";
        }
        Maquina buscada = buscarMaquina(codigo);
        if (buscada == null) {
            return "Error: no existe la máquina con el código " + codigo;
        }
        buscada.setEstado(nuevoEstado);
        return "Estado de la máquina actualizado con éxito";
    }
    //maquina mayorvalormantenimiento
    public String sacarMaquinamayorvalorM(String estado, String valorMantenimiento, ArrayList<Maquina> listaMaquinas) {
        if(listaMaquinas.isEmpty()){
            return null;
        }
        Maquina mayor= (Maquina) listaMaquinas.get(0);
        for(Maquina maquina: listaMaquinas){
            if(maquina.getEstado().equals("mantenimiento") && maquina.getValorMantenimiento()
                    > mayor.getValorMantenimiento()){
                mayor=maquina;
            }
        }
        return mayor.getCodigo();
    }

    //maquina menorvalormantenimiento
    public String sacarMaquinamenorvalorM(String estado, String valorMantenimiento, ArrayList<Maquina> listaMaquinas) {
        if(listaMaquinas.isEmpty()){
            return null;
        }
        Maquina menor= (Maquina) listaMaquinas.get(0);
        for(Maquina maquina: listaMaquinas){
            if(maquina.getEstado().equals("mantenimiento") && maquina.getValorMantenimiento()
                    < menor.getValorMantenimiento()){
                menor=maquina;
            }
        }
        return menor.getCodigo();
    }
    }
