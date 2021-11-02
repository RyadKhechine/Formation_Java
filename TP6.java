import java.util.Scanner;

public class TP6 {
        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);


            System.out.println("Entrez la première valeur  :");
            int x = keyboard.nextInt();

            System.out.println("Entrez la première valeur  :");
            int y = keyboard.nextInt();

            System.out.printf("Les valeurs entrées sont : x= %d y=%d\n",x,y);

            int attente = x;
            x = y;
            y = attente;

            System.out.printf("Les valeurs permutées sont : x= %d y=%d",x,y);

        }

}
