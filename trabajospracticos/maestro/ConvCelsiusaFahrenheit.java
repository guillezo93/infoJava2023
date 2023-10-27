package trabajospracticos.maestro;

import java.util.Scanner;

public class ConvCelsiusaFahrenheit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tempCelsius, tempFahrenheit;
        //formula
        //Grados Fahrenheit = (grados centígrados × 9/5) +32.

        System.out.println("Ingrese los grados celsius que desea convertir: ");
        tempCelsius = teclado.nextDouble();

        tempFahrenheit = (tempCelsius * 9/5) + 32;

        System.out.println("La temperatura con la conversión a Fahrenheit es: " + tempFahrenheit);


    }


}
