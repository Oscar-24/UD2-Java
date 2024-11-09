import java.util.Scanner;

public class Actividad_5 {
    public static void main(String[] var0) {
        String nombre;
        String iniciales= "";

        System.out.print("Introduce tu nombre: ");
        Scanner entrada = new Scanner(System.in);
        nombre=entrada.nextLine();
        iniciales+=nombre.charAt(0);
        for (int i = 0; i < nombre.length(); i++) {            
            if (nombre.charAt(i)== ' ') {
                iniciales+=nombre.charAt(i+1);
            }
        }
        System.out.println(iniciales.toUpperCase());
    }
}
