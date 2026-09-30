package co.edu.uniquindio.co.model;

public class Maquina {

    private String codigo;
    private String nombre;
    private String tipo;
    private String zona;
    private String estado;
    private float valorMantenimiento;

    public Maquina(String codigo, String nombre, String tipo, String zona, String estado, float valorMantenimiento){
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.zona = zona;
        this.estado = estado;
        this.valorMantenimiento = valorMantenimiento;
    }
    public void setCodigo(){
        this.codigo = codigo;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setNombre(){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTipo(){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setZona(){
        this.zona = zona;
    }
    public String getZona(){
        return zona;
    }
    public void setEstado(){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    public void setValorMantenimiento(){
        this.valorMantenimiento = valorMantenimiento;
    }
    public float getValorMantenimiento(){
        return valorMantenimiento;
    }
}
