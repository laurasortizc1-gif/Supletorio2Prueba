package co.edu.uniquindio.co.model;

import java.util.ArrayList;

public class Reserva {

    private ArrayList<Maquina> listaMaquinas;
    private String codigo;
    private String fecha;
    private String hora;
    private byte duracion;
    private String estado;
    private String tipo;
    private float valor;

    //relacion
    private Reserva ownedByCurso;

    public Reserva (String codigo, String fecha, String hora, byte duracion, String estado, String tipo, float valor){
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.estado = estado;
        this.tipo = tipo;
        this.valor = valor;
        this.listaMaquinas= new ArrayList<>();
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public String getFecha(){
        return fecha;
    }
    public void setHora(String hora){
        this.hora = hora;
    }
    public String getHora(){
        return hora;
    }
    public void setDuracion(byte duracion){
        this.duracion = duracion;
    }
    public byte getDuracion(){
        return duracion;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public float getValor(){
        return valor;
    }
}
