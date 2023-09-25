package trabajospracticos.IniciadoJavaJedi;

public class CalculoDeDivisibilidad {
    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado;

        num1 = 100;
        num2 = 10;

        resultado = num1 / num2;

        if (num1 % num2 == 0) {
            System.out.println("El valor de " + num1 + ", si es divisible por " + num2);
        } else {
            System.out.println("No es divisible");
        }
    }
}
