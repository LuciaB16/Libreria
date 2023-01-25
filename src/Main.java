public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean resultado = false;

        resultado = EntradaSalida.salida("Hello World", EntradaSalida.SALIDA_CONSOLA);
        resultado = EntradaSalida.salida("Hello World", EntradaSalida.SALIDA_WINDOW);

    }
}