package trabajospracticos.padawan;

import java.util.Scanner;

public class ConversionKilogramos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        double libras;
        int kilogramos;
        System.out.println("Ingrese la cantidad de kilogramos que desea convertir a libras");
        kilogramos = teclado.nextInt();
        final double CONVERSOR = 0.45359237;

        libras = (kilogramos * CONVERSOR);

        System.out.println("libras = " + libras);
    }
}
