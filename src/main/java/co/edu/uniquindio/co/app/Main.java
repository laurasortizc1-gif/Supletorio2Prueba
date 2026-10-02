package co.edu.uniquindio.co.app;

import  co.edu.uniquindio.co.model.Entrenador;
import co.edu.uniquindio.co.model.Gymnasio;
import  co.edu.uniquindio.co.model.Maquina;
import  co.edu.uniquindio.co.model.Reserva;
import  co.edu.uniquindio.co.model.Usuario;


import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static void main() {

        JOptionPane.showMessageDialog(null,"Bienvenidos al sistema del gimnasio");
        String nombreGimnasio = JOptionPane.showInputDialog(null,"Por favor ingresar el nombre del curso");
        String codigoGimnasio = JOptionPane.showInputDialog(null,"Por favor ingresar el codigo del curso");

        Gymnasio gimnasio = new Gymnasio(nombreGimnasio,codigoGimnasio);

        //CRUD create, read, update,delete
        int opcion;

        do{
            opcion = Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Por favor selecciones una opcion :\n ---Menu--\n"+
                            "1. Registrar usuario\n" +
                            " 2. Buscar usuario vip\n"+
                            " 3. Mostrar Matriz ocupacional\n"+
                            " 4. Verificar reserva especial\n"+
                            " 5. Mostrar reporte de ingresos\n"+
                            " 6. Mostrar control maquinas\n"+
                            " 7. Mostrar analisis rendimiento entrenadores\n"+
                            ""));

            switch (opcion){
                case 1:
                    crearUsuario(gimnasio);
                    break;
                case 2:
                    consultarUsuarioVip(gimnasio);
                    break;
                case 3:
                    sacarOcupacionGym();
                    break;
                case 4:
                    reservaEspecial(codigoReserva);
                    break;
                case 5:
                    reporteIngresos(fecha, estadoReserva, listaReserva, valorReserva);
                    break;
                case 6:
                    sacarMaquinamenorvalorM(estado, valorMantenimiento, listaMaquinas);
                    sacarMaquinamenorvalorM(estado, valorMantenimiento, listaMaquinas);
                    sacarCantidadMaquinasEstado(listaMaquinas, estado, codigo);
                    break;
                case 7:
                    sacarOcupacionGym(zona, fecha, usuario, listaReserva, listaMaquinas);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Muchas gracias por usar nuestro sistema");
                    break;
                default:JOptionPane.showMessageDialog(null,"Opcion Invalida");

            }

        }while(opcion != 0);


    }

        //metodo matriz ocupacional
    public static String sacarOcupacionGym(String zona, String fecha, String usuario,
                                    ArrayList<Reserva> listaReservas, ArrayList<Maquina> listaMaquinas){

        //filas=zonas y columnas =dias
        int matriz[][] = new int[3][7];

        String zonas[]={
            "zcardiovascular",
            "zpesas",
            "zfuncional"
        };

       String dias[]={
               "lunes",
               "martes",
               "miercoles",
               "jueves",
               "viernes",
               "sabado",
               "domingo"
        };

        //recorrer reserva y maquina para saber cantidad
        for(int i=0; i<listaReservas.size(); i++) {
            fecha = listaReservas.get(i).getFecha();
            zona = listaMaquinas.get(i).getZona();

            int fila = -1;
            int columna = -1;

            //buscar zona
            for (int j = 0; j <3; j++) {
                if (zona == zonas[i]) {
                    fila = j;
                    break;
                }
            }

            //buscar dia

            for (int j = 0; j < 7; j++) {
                if (fecha == dias[j]) {
                    columna = j;
                    break;
                }
            }
            //si se encontro la zona y dia se pasa a la cantidad sde usuarios

            if(fila !=-1 && columna!=-1){
                matriz[fila][columna]++;
            }
        }
        String mensaje="la información ocupacional de la matriz Gimnasio es:"+"\n";
        //mostrar M
        for(int i=0;i<7; i++){
           mensaje+=dias[i]+"\n";
        }
        for (int j=0;j<3;j++){
            mensaje+=zonas[j]+"\n";

        }

       //dia mayor cantidad usuarios
        int mayor=0;
        int suma=0;
        for(int i=0;i<7;i++){
                  mayor=suma;
            for (int j=0; j<3;j++){
                suma+=matriz[i][j];
            }

          if( mayor>suma){
              mensaje="el dia con mayor cantidad de usuarios es;  "+dias[i]+"\n";
          }
        }

        //dia menor cantidad usuaarios
        int menor=0;
        int suma1=0;
        for(int i=0;i<=7;i++){
            menor=suma;
            for (int j=0; j<=3;j++){
                suma+=matriz[i][j];
            }
            if( menor<suma){
                mensaje="el dia con menor cantidad de usuarios es;  "+dias[i]+"\n";
            }
        }
        //total usuarios semana
        int sumatotalusuario=0;
        for(int i=0;i<7;i++) {

            for (int j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
        }
            //zona con mayor ocupación semanal
             int sumazona=0;
             int mayor1=0;
             int comparador=0;

            for(int j=0;j<3;j++){
                sumazona=0;

                for(int i=0;i<7;i++) {
                    sumazona += matriz[j][i];
                }
                if(sumazona>comparador) {
                    comparador = sumazona;
                    mayor=j;
                }
                }
            mensaje+="la zona con mayor utilizacion semanal es: "+zonas[mayor];

            return mensaje;
    }
    //funcionalidades o metodos maquinas

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
    public static String sacarMaquinamenorvalorM(String estado, String valorMantenimiento, ArrayList<Maquina> listaMaquinas) {
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
    public static Maquina buscarMaquina(String codigo,ArrayList<Maquina> listaMaquinas) {
        for (Maquina aux : listaMaquinas) {
            if (aux.getCodigo().equals(codigo)) {
                return aux;
            }
        }
        return null;
    }
    //cantidad de maquinas en cada estado
    public static String sacarCantidadMaquinasEstado(ArrayList<Maquina> listaMaquinas,String estado, String codigo){

        int sumaMantenimiento=0;
        int sumaDisponible=0;
        int sumaUso=0;
        for(Maquina maquina:listaMaquinas){
            Maquina buscada = buscarMaquina(codigo,listaMaquinas);
            if (buscada != null && maquina.getEstado().equals("mantenimiento")) {
                sumaMantenimiento++;
            } else if (buscada != null && maquina.getEstado().equals("disponible")) {
                sumaDisponible++;
            }else {
                sumaUso++;
            }
        }
        return "la cantidad de maquinas en mantenimiento es:  "+sumaMantenimiento +"/n"
                + "la cantidad de maquinas disponibles es:  "+sumaDisponible+"/n"
                +"la cantidad de maquinas en uso es: "+sumaUso;
    }
    private static void consultarUsuarioVip(Gymnasio gimnasio, String membresia, ArrayList<Usuario> listaUsuarios) {
        String mensaje = "";
        for (Usuario usuarioAux : listaUsuarios) {
            if (membresia.equalsIgnoreCase("Vip")) {
                mensaje += usuarioAux;
            }
        }
    }

    private static String reservaEspecial(String codigoReserva, ArrayList<Reserva> listaReserva) {
        String mensaje = "";
        int numero = Integer.valueOf(codigoReserva);
        int codigoEspecial = 0;
        for (int i = 0; i < listaReserva.size(); i++) {//.size es un metodo que puede tomar la longitud de un array

            for (int j = numero; j > 0; j /= 10) {
                codigoEspecial += j % 10;
            }
            if (codigoEspecial % 2 == 0) {
                mensaje += "Su reserva es especial.";
            } else {
                mensaje += "Su reserva es normal.";
            }
        }
        return mensaje;
    }
    private static String reporteIngresos (String fecha, String estadoReserva, ArrayList<Reserva> listaReservas, float valorReserva){
        String mensaje="*REPORTE INGRESOS* \n";
        String fechaEspecifica= JOptionPane.showInputDialog("¿A que fecha desea consultar los ingresos?: ");
        int acumulador=0;
        for(Reserva reservaAux: listaReservas) {
            if (fecha.equalsIgnoreCase(fechaEspecifica) && estadoReserva.equalsIgnoreCase("Confirmada.") || estadoReserva.equalsIgnoreCase("Finalizada.")) {
                acumulador+=valorReserva;
            }
        }
        mensaje+="Los ingresos del día " + fechaEspecifica+ "son: " +acumulador;
        return mensaje;
    }
    private static void crearUsuario(Gymnasio gimnasio) {

        String nombres = JOptionPane.showInputDialog(null,"Por favor ingresar los nombres del usuario nuevo");
        String documento = JOptionPane.showInputDialog(null,"Por favor ingresar el documento del usuario nuevo");
        String edad = JOptionPane.showInputDialog(null,"Por favor ingresar la edad del usuario nuevo");
        byte edadUsuario = Byte.valueOf(edad);
        String correo = JOptionPane.showInputDialog(null,"Por favor ingresar el correo del usuario nuevo");
        String telefono = JOptionPane.showInputDialog(null,"Por favor ingresar el telefono del usuario nuevo");
        String peso = JOptionPane.showInputDialog("Por favor ingrese el peso del usuario nuevo.");
        float pesoUsuario = Float.valueOf(peso);
        String membresía= JOptionPane.showInputDialog("Por favor ingrese la membresia que tendra el usuario nuevo.");

        String resultado = gimnasio.registrarUsuario(nombres,documento,edadUsuario,correo,telefono, pesoUsuario);

        JOptionPane.showMessageDialog(null,resultado);


    }
}


