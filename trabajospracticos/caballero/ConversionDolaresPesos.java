package trabajospracticos.caballero;

import java.util.Scanner;

public class ConversionDolaresPesos {
    public static void main(String[] args) {
        int equivalente = 20;

        System.out.println("Ingrese la cantidad de Dolares que desea: ");
        Scanner leer = new Scanner(System.in);
        int dolares = leer.nextInt();

        int resultado = dolares * equivalente;

        System.out.println("El equivalente es : " + resultado + " pesos");


    }
}
