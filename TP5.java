import java.util.Scanner;
public class TP5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Entrez a");
        int a = keyboard.nextInt();

        System.out.println("Entrez b");
        int b = keyboard.nextInt();

        System.out.println("Entrez c");
        int c = keyboard.nextInt();

        System.out.println("Entrez x");
        double x = keyboard.nextDouble();

        double polynome = (((a+b)/2.0)*Math.pow(x,3)) + (Math.pow((a+b),2)*Math.pow(x,2)+a+b+c);

        System.out.println("La valeur du polynôme est:"+polynome);
    }
}
