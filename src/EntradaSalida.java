import javax.swing.*;


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
                    System.out.println("Consola: " +msj);
                    return true;

                case SALIDA_WINDOW:
                    JOptionPane.showMessageDialog(null,"Sale por una ventana" + msj);
                    return true;

                    default:
                    return false;

        //Commit metodo de salida
            }
    }
}
