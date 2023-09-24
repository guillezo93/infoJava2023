package TrabajosPracticos01.IniciadoJavaJedi;

public class SumaDeDosNumerosB {
    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado;

        num1 = 20;
        num2 = 22;

        resultado = num1 + num2;
        System.out.println("resultado = " + resultado);

        String par = "par";
        String impar = "impar";

        if(resultado % 2 == 0) {
            System.out.println("El resultado " + resultado + " y es " + par);
        } else {
            System.out.println("El resultado " + resultado + " y es " + impar);
        }




    }
}
