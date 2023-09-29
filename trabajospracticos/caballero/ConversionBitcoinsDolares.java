package trabajospracticos.caballero;

import java.util.Scanner;

public class ConversionBitcoinsDolares {
    public static void main(String[] args) {
        int equivalente = 50000;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de bitcoins que desea convertir");
        double bitcoins = leer.nextDouble();

        double resultado = bitcoins * equivalente;

        System.out.println((int)resultado + " dólares");

    }
}
