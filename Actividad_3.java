import java.util.Scanner;

public class Actividad_3 {
    public static void main(String[] var0) {
        String cadena;
        int contador = 0;
        System.out.println("Introduce una cadena: ");
        Scanner entrada = new Scanner(System.in);
        cadena = entrada.nextLine();
        System.out.println("Introduce un caracter: ");
        Scanner letra = new Scanner(System.in);
        char caracter = letra.findInLine(".").charAt(0);
        
        for (int i = 0; i < cadena.length(); i++) {
            
            if (cadena.charAt(i)== caracter) {
                contador++;
            }
            
        }
        System.out.println("Se ha repetido "+contador+" veces");
    }
}
