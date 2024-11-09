import java.util.Scanner;

public class Actividad_10 {
    public static void main(String[] var0) {
        String frase;
        String frasereversa = " ";

        System.out.println("Introduce una cadena para saber si es un palindromo: ");
        Scanner entrada= new Scanner(System.in);
        frase = entrada.nextLine();

        for (int i = frase.length()-1; i >= 0; i--) { 
                        frasereversa += frase.charAt(i);
                    }
        if (frasereversa!=frase) {
            System.out.println("Esta cadena no es un palindromo");
        } else {
            System.out.println("Esta cadena es un palindromo");
        }
        System.out.println(frasereversa);
    }
}
