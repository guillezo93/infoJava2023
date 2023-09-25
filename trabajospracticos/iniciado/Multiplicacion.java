package trabajospracticos.IniciadoJavaJedi;

public class Multiplicacion {
    public static void main(String[] args) {
        double valor1, valor2, valor3, valor4, resultado1, resultado2;
        valor1 = 20;
        valor2 = 30;
        resultado1 = valor1 * valor2;
        System.out.println("resultado1 = " + resultado1);

        valor3 = 20.5;
        valor4 = 9;
        resultado2 = valor4 * valor3;
        System.out.println("resultado2 = " + resultado2);

        //El resultado nos retorna un valor real.
        //En este caso elegí el tipo de dato double, pero podría haber usado int para enteros, o float para números flotantes(decimales)
        // Por eso es que nos retorna un valor real expresado con (0) decimal.

    }
}
