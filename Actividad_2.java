import java.util.Scanner;

public class Actividad_2 {
    public static void main(String[] var0) {
        String cadena;
        String subcadena;
        System.out.println("Introduce una cadena: ");
        Scanner entrada = new Scanner(System.in);
        cadena = entrada.nextLine();
        System.out.println("Introduce una subcadena: ");
        Scanner caracter=new Scanner(System.in);
        subcadena = caracter.nextLine();
        if (cadena.startsWith(subcadena)) {
            System.out.println("La subcadena esta en la cadena principal");
        } else {
            System.out.println("La subcadena no esta en la cadena principal");
        }

    }

}