import java.util.Scanner;

public class Actividad_1 {
    public static void main(String[] var0) {
    String cadena;
    char caracter;
    System.out.println("Introduce una palabra: ");
    Scanner entrada = new Scanner(System.in);
    cadena = entrada.nextLine();
    for (int i = 0; i < cadena.length(); i++) {
        caracter = cadena.charAt(i);
        System.out.println(caracter);
        }
    }
}
