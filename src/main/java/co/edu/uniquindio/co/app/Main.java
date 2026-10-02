package co.edu.uniquindio.co.app;

import co.edu.uniquindio.co.model.Gymnasio;
import  co.edu.uniquindio.co.model.Maquina;
import  co.edu.uniquindio.co.model.Reserva;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static <ingresar> void main() {


        }

        //metodo matriz ocupacional
    public String SacarOcupacionGym(String zona, String fecha, String Usuario,
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
    public Maquina buscarMaquina(String codigo,ArrayList<Maquina> listaMaquinas) {
        for (Maquina aux : listaMaquinas) {
            if (aux.getCodigo().equals(codigo)) {
                return aux;
            }
        }
        return null;
    }
    //cantidad de maquinas en cada estado
    public String sacarCantidadMaquinasEstado(ArrayList<Maquina> listaMaquinas,String estado, String codigo){

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


}


