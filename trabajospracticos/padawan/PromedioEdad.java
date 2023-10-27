package trabajospracticos.padawan;

public class PromedioEdad {
    public static void main(String[] args) {
        String persona1 = "Juan";
        int edad1 = 30;

        String persona2 = "Pedro";
        int edad2 = 54;

        String persona3 = "Ignacio";
        int edad3 = 12;

        String persona4 = "Guillermo";
        int edad4 = 22;

        String persona5 = "Maximo";
        int edad5 = 10;

        int cantidadDePersonas = 5;

        int promedio = (edad1 + edad2 + edad3 + edad4 + edad5 ) / cantidadDePersonas;
        System.out.println("--------------------------------------------------------------------");
        System.out.println("El nombre de la persona es : " + persona1 + " y su edad es " + edad1);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("El nombre de la persona es : " + persona2 + " y su edad es " + edad2);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("El nombre de la persona es : " + persona3 + " y su edad es " + edad3);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("El nombre de la persona es : " + persona4 + " y su edad es " + edad4);
        System.out.println("--------------------------------------------------------------------");
        System.out.println("El nombre de la persona es : " + persona5 + " y su edad es " + edad5);
        System.out.println("--------------------------------------------------------------------");

        System.out.println("El promedio total de todas las edades es: " + promedio);
        System.out.println("--------------------------------------------------------------------");
    }
}
