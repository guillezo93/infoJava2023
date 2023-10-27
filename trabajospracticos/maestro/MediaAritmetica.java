package trabajospracticos.maestro;

import java.util.Scanner;
public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int media, suma, n1, n2, n3 ,n4 , k;


        System.out.println("A continuación tendremos");
        System.out.println("Ingrese el valor de n1");
        n1 = teclado.nextInt();
        System.out.println("Ingrese el valor de n2");
        n2 = teclado.nextInt();
        System.out.println("Ingrese el valor de n3");
        n3 = teclado.nextInt();
        System.out.println("Ingrese el valor de n4");
        n4 = teclado.nextInt();
        k = 4;

        suma = n1 + n2 + n3 + n4;

        media = suma / k;

        System.out.println("El calculo de la media aritmética es: " + media);
    }
}