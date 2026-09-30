package co.edu.uniquindio.co.model;

public class Gymnasio {
    private String nombre;
    private String codigoGym;
    private String direccion;
    private String telefono;

    //metodo contructor

    public Gymnasio(String nombre,String codigoGym,String direccion,String telefono) {
        this.nombre = nombre;
        this.codigoGym = codigoGym;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //getter

    public String getNombre() {
        return nombre;
    }

    public String getCodigoGym() {
        return codigoGym;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    //setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoGym(String codigoGym) {
        this.codigoGym = codigoGym;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
