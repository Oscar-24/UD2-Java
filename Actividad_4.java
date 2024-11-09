import java.util.Scanner;

public class Actividad_4 {
    public static void main(String[] var0) {
        String frase;
        char i;
        int contador=1;
        System.out.println("Introduce una frase: ");
        Scanner cadena=new Scanner(System.in);
        frase=cadena.nextLine();
        for ( i = 1; i < frase.length(); i++) {
            if (frase.charAt(i)== ' ' ) {
                contador++;
            }
        }
        System.out.println("Hay "+contador+" palabras.");

    }
}
