package trabajospracticos.IniciadoJavaJedi;

public class TrianguloDeAsteriscos {
    public static void main(String[] args) {
        triangulo(4);

    }

    public static void triangulo( int filas) {
        int i,j;

        for (i = 1; i<= filas; i++) {
            for (j=1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
