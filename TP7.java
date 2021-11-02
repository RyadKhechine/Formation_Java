import java.util.Scanner;
public class TP7 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.print("Entrez un nombre entier :");
        int nombre = keyb.nextInt();

        if (nombre == 0){
            System.out.println("Le nomnre = 0 et il est pair");
        } else{
            if (nombre < 0){
                System.out.println("le nombre est négatif");
            }
            else{
                System.out.println("le nombre est positif");
            }
        }
        if (nombre%2==0){
            System.out.println("Le nombre est pair");
        }else {
            System.out.println("le nombre est impair");
        }
    }
}
