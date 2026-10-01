package co.edu.uniquindio.co.app;

import co.edu.uniquindio.co.model.Entrenador;
import co.edu.uniquindio.co.model.Gymnasio;
import  co.edu.uniquindio.co.model.Maquina;
import  co.edu.uniquindio.co.model.Reserva;
import  co.edu.uniquindio.co.model.Usuario;
import javax.swing.*;

public class Main {
    static <ingresar> void main() {


        JOptionPane.showMessageDialog(null, "Bienvenidos al Gimnasio");
        String nombre = JOptionPane.showInputDialog(null, "Por favor ingresar el nombre del Gimnasio");
        String codigoGym = JOptionPane.showInputDialog(null, "Por favor ingresar el codigo del Gimnasio");

        Gymnasio gimnasio = new Gymnasio(codigoGym, nombre);

        //crud funcionalidades; crear, actualizar, eliminar, buscar
        do {
            int opcion = Integer.valueOf(JOptionPane.showInputDialog(null,
                    "Por favor selecciones una opcion :\n ---Menu--\n" +
                            "1. ingresar usuario \n" +
                            " 2. mostrar analisis de rendiemiento de entrenadores\n" +
                            " 3. buscar usurarios VIP \n" +
                            " 4. buscar ocupación del hotel\n" +
                            " 5. buscar ingresos del gymnasio\n" +
                            " 6. mostrar información de las maquinas \n" +
                            ""));

            switch (opcion) {
                case 1:
                    ingresar usuario (Gymnasio);
                    break;
                case 2:
                    mostraranalisisderendiemiento(Entrenador);
                    break;
                case 3:


            }
        }
    }
    }