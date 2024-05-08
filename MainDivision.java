import java.util.Scanner;

public class MainDivision {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // Crear un objeto de tipo Division
        Division d1 = new Division();

        // Solicitar al usuario que ingrese el primer número
        System.out.println("Ingresa el primer número:");
        double a = sc.nextDouble();
        d1.setA(a);

        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Ingresa el segundo número:");
        double b = sc.nextDouble();
        d1.setB(b);

        // Realizar la división
        d1.dividir();

        // Obtener el resultado de la división
        double r = d1.getR();
        System.out.println("La división es: " + r);
        System.out.println(d1.toString());

        // Cerrar el Scanner
        sc.close();
    }
}
