package co.edu.uniquindio.co.model;

public class Entrenador {

    private String nombre;
    private byte edad;
    private String documento;
    private String telefono;
    private String especialidad;
    private byte añosExperiencia;


    //metodo constructor

    public Entrenador(String nombre, byte edad,String documento,String telefono,
                      String especialidad,byte añosExperiencia) {
        this.nombre = nombre;
        this.documento=documento;
        this.edad=edad;
        this.telefono=telefono;
        this.especialidad=especialidad;
        this.añosExperiencia=añosExperiencia;
    }

    //getter

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public byte getAñosExperiencia() {
        return añosExperiencia;
    }

    //setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAñosExperiencia(byte añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
}
