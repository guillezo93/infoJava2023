package trabajospracticos.maestro;

import java.util.Scanner;

public class CalculoVelocidadFinal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int v_i;
        double v_f;
        int t;
        final double g = 9.8;

        System.out.println("Ingrese el valor de la velocidad inicial del objeto");
        v_i = teclado.nextInt();
        System.out.println("Ingrese el valor del tiempo transcurrido");
        t = teclado.nextInt();

        v_f = (v_i) + (g * t);

        System.out.println("El valor de la velocidad final es: " + v_f);
    }
}
