package trabajospracticos.caballero;

import java.util.Scanner;

public class ConversionPesosEuros {
    public static void main(String[] args) {
        int equivalente = 20;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de pesos que desea convertir");
        int pesos = leer.nextInt();

        int resultado = pesos / equivalente;
        System.out.println(resultado + " euros");
    }
}
