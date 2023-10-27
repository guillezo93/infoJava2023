package trabajospracticos.maestro;

import java.util.Scanner;

public class HipotenusaTriangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        double h;

        System.out.println("Ingrese el valor del cateto a");
        a = teclado.nextInt();

        System.out.println("Ingrese el valor del cateto b");
        b = teclado.nextInt();

        h = (double) ((Math.pow(a,2)) + (Math.pow(b,2)));

        System.out.println("La hipotenusa es: " + h);
    }
}
