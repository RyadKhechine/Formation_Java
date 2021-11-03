import java.util.Objects;
import java.util.Scanner;

public class TP12_13 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        String email;
        String motDePasse;
        String emailVerification = "";
        String motDePasseVerification = "";
        int nombreDeConnexion = 0;
        int decompteConnexion = 5;

        System.out.println("Inscription email :");
        email = keyb.nextLine();

        System.out.println("Inscription mot de passe :");
        motDePasse = keyb.nextLine();


        while (!Objects.equals(email, emailVerification) || !Objects.equals(motDePasse, motDePasseVerification)) {
            System.out.println("Connexion email :");
            emailVerification = keyb.nextLine();

            System.out.println("Connexion mot de passe :");
            motDePasseVerification = keyb.nextLine();
            nombreDeConnexion++;
            decompteConnexion--;

            if (Objects.equals(email, emailVerification) && Objects.equals(motDePasse, motDePasseVerification)) {
                System.out.println("Bienvenue dans votre espace client");
            } else {
                System.out.println("Identifiant incorrect");
                System.out.printf("Il vous reste %d tentative \n",decompteConnexion);
            }
            if (nombreDeConnexion == 5) {
                System.out.println("Votre compte est bloqué");
                break;
            }
        }
    }
}
