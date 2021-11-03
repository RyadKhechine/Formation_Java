import java.util.Scanner;
public class TP8 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println("Entrez a");
        int a = keyb.nextInt();

        System.out.println("Entrez b");
        int b = keyb.nextInt();

        System.out.println("Entrez c");
        int c = keyb.nextInt();


        double delta = Math.pow(b,2) - 4 * a*c;

        if (delta < 0){
            System.out.println("pas de solution");
        }
        if (delta>0){
            double x1 = (-b-Math.sqrt(delta))/(2.0*a);
            double x2 = (-b+Math.sqrt(delta))/(2.0*a);
            System.out.printf("x1: %32.2f, x2: %32.2f", x1, x2);
        }
        if (delta==0){
            double x0 = -b/(2.0*a);
            System.out.printf(" x0 %f", x0);
        }


    }
}
