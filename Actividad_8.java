import java.util.Scanner;

public class Actividad_8 {
    public static void main(String[] var0) {
        String cadena;
        String frasefinal= " ";

        System.out.println("Introduce una cadena: ");
        Scanner entrada=new Scanner(System.in);
        cadena=entrada.nextLine();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i)==cadena.toLowerCase().charAt(i)) {
                frasefinal+=cadena.toUpperCase().charAt(i);
            } else {
                frasefinal+=cadena.toLowerCase().charAt(i);
            }
        }
        System.out.println(frasefinal);
    }

}
