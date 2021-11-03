import java.util.Scanner;

public class TP9 {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println("Entrez un entier en 1 et 12");
        int a = keyb.nextInt();

        switch (a) {
            case 1:
                System.out.println("Janvier");
            case 2:
                System.out.println("Février");
            case 3:
                System.out.println("Mars");
            case 4:
                System.out.println("Avril");
            case 5:
                System.out.println("Mai");
            case 6:
                System.out.println("Juin");
            case 7:
                System.out.println("Juillet");
            case 8:
                System.out.println("Août");
            case 9:
                System.out.println("Septembre");
            case 10:
                System.out.println("Octobre");
            case 11:
                System.out.println("Novembre");
            case 12:
                System.out.println("Décembre");
                break;
            default:
                System.out.println("Choix incorrect");
        }


    }

}