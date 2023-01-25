public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean isOK_ventana = false;
        boolean isOK_consola = false;

        isOK_ventana= EntradaSalida.salida("Hello World", EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola ) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello World", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana ) System.out.println("ERROR VETANA");

    }
}