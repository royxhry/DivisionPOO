import java.util.Scanner;

public class MainDivision {
    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);
        Division d1 = new Division();

        System.out.println("ingresa el primer numero");
        double a = sc.nextDouble();
        d1.setA(a);
        System.out.println("ingresa el primer numero");
        double b = sc.nextDouble();
        d1.setB(b);

        d1.dividir();
        double r = d1.getR();
        System.out.println("LA division es:"+r);
        System.out.println(d1.toString());
        sc.close();
        


    }
}
