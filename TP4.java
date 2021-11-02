import java.util.Scanner;
import java.time.LocalDate;
public class TP4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Quel est votre age ?");
        int age = keyboard.nextInt();

        LocalDate dateActuel = LocalDate.now();
        int AnneeActuel = dateActuel.getYear();
        System.out.println("Current year: "+AnneeActuel);
        int anneeNaissance = AnneeActuel - age;
        System.out.println("Votre année de naissance est : "+anneeNaissance);


    }
}
