package trabajospracticos.caballero;

import java.util.Scanner;

public class ConversionLibraDolares {
    public static void main(String[] args) {
        double equivalente = 1.40;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de Libra Esterlinas que desea convertir: ");
        int libraEsterlina = leer.nextInt();

        double resultado = libraEsterlina * equivalente;
        System.out.println( (int)resultado + " dólares");
    }
}
