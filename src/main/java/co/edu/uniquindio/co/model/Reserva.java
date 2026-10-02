package co.edu.uniquindio.co.model;

import java.util.ArrayList;

public class Reserva {

    public boolean getentrenador;
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
    public void setCodigo(){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setFecha(){
        this.fecha = fecha;
    }
    public String getFecha(){
        return fecha;
    }
    public void setHora(){
        this.hora = hora;
    }
    public String getHora(){
        return hora;
    }
    public void setDuracion(){
        this.duracion = duracion;
    }
    public byte getDuracion(){
        return duracion;
    }
    public void setEstado(){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    public void setTipo(){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setValor(){
        this.valor = valor;
    }
    public float getValor(){
        return valor;
    }
}
