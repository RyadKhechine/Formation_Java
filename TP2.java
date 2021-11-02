import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Votre nom :");
        String nom=keyboard.nextLine();

        System.out.println("Votre prenom :");
        String prenom=keyboard.nextLine();

        System.out.println("Votre age :");
        int age=keyboard.nextInt();


        System.out.printf("Vous vous appelez %s %s , et vous avez %d ans",nom,prenom,age);

    }
}
