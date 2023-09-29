package trabajospracticos.caballero;

import java.util.Scanner;

public class ConversionEuroDolares {
    public static void main(String[] args) {
        double equivalente = 1.20;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Euros que desea convertir");
        int euros = leer.nextInt();
        double resultado = euros*equivalente;
        System.out.println((int)resultado + " dólares");


    }
}
