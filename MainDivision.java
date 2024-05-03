import java.util.Scanner;

public class MainDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Division d1 = new Division();

        System.out.println("Ingresa el primer número: ");
        double a = scanner.nextDouble();

        System.out.println("Ingresa el segundo número: ");
        double b = scanner.nextDouble();


        double r = d1.dividir(a,b);
        System.out.println("El resultado de la division es " + r);

        scanner.close();
    }
}
