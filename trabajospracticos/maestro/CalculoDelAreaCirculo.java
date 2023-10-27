package trabajospracticos.maestro;

import java.util.Scanner;

public class CalculoDelAreaCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int radio = 5;
        double area;

        area = Math.PI * (Math.pow(radio,2));

        System.out.println("El area de un Circulo de 5 unidades es: " + area + " unidades");

        //Dando al usuario que coloque un radio aleatorio:
        double areaUsuario;
        System.out.println("Ingrese el valor del radio que tiene el circulo");
        int radioUsuario = teclado.nextInt();
        areaUsuario = Math.PI * (Math.pow(radioUsuario, 2));

        System.out.println("El radio de un circulo de radio dado por el usuario = " + areaUsuario);

    }
}
