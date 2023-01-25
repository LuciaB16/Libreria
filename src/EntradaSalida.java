import javax.swing.*;
import java.util.Scanner;


public class EntradaSalida {
     static final int SALIDA_CONSOLA = 1;
     static final int SALIDA_WINDOW = 2;

    /**
     * Salida por ventana o consola de un mensaje
     * @param msj cadena que queremos imprimir
     * @param device dispositivo de salida, consola (SALIDA_CONSOLA) o ventana (SALIDA_VENTANA) que queremos utilizar para imprimir
     * @return si es True: correcto sino es false
     */
    static boolean salida(String msj, int device){
            switch (device){
                case SALIDA_CONSOLA:
                    //TODO: try catch
                    try {
                        System.out.println("Consola: " + msj);
                        return true;
                    }catch (Exception e){
                        return false;
                    }
                case SALIDA_WINDOW:
                    try {
                        JOptionPane.showMessageDialog(null, "Sale por una ventana" + msj.toCharArray()[20]);
                        return true;
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                        return false;
                    }

                    default:
                    return false;

        //Commit metodo de salida
            }
    }
    static String entrada(String mensaje){
        Scanner sc= new Scanner(System.in);
        return "";
    }
}
