package trabajospracticos.maestro;

import java.util.Scanner;

public class CalculoFuerzaCentripeta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int m, r;
        double v, F_c;

        System.out.println("Ingrese el valor de la masa del objeto");
        m = teclado.nextInt();

        System.out.println("Ingrese el valor de la velocidad del objeto");
        v = teclado.nextDouble();

        System.out.println("Ingrese el valor del radio de la trayectoria");
        r = teclado.nextInt();

        F_c = (m * (Math.pow(v,2))) / r;

        System.out.println("La fuerza centrípeta es: " + F_c);


    }
}
