package trabajospracticos.maestro;

import java.util.Scanner;

public class CalculoEnergiaCinetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double e, v;
        int m;

        System.out.println("Ingrese el valor de la masa");
        m = teclado.nextInt();

        System.out.println("Ingrese el valor de la velocidad");
        v = teclado.nextDouble();

        e = 0.5 * m * (Math.pow(v, 2));

        System.out.println("El valor de la energía es: " + e);


    }
}
