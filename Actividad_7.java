import java.util.Scanner;
public class Actividad_7 {
    public static void main(String[] var0) {
        String cadena;
        char caracter1;
        char reemplazo;
        String cadenafin;

        System.out.println("Introduce una cadena: ");
        Scanner entrada=new Scanner(System.in);
        cadena=entrada.nextLine();

        System.out.println("Introduce un caracter: ");
        Scanner medio=new Scanner(System.in);
        caracter1=medio.findInLine(".").charAt(0);

        System.out.println("Introduce el caracter a reemplazar: ");
        Scanner salida=new Scanner(System.in);
        reemplazo=salida.findInLine(".").charAt(0);

        cadenafin=cadena.replace(caracter1, reemplazo);

        System.out.println(cadenafin);
        
    }
}
