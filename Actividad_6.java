import java.util.Scanner;
public class Actividad_6 {
    public static void main(String[] var0) {
        String cadena;
        String cadena2 = "";

        System.out.println("Introduce una palabra para invertir: ");
        Scanner entrada = new Scanner(System.in);
        cadena=entrada.nextLine();
        
        for (int i = cadena.length()-1; i >= 0; i--) { 
// Para que pille toda la palabra o frase, tiene que leer la primera letra. Por  eso se debe poner "i>=0".

            cadena2 += cadena.charAt(i);
        }
        System.out.println(cadena2);
    }
}
