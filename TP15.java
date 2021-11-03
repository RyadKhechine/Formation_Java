import java.util.Arrays;
import java.util.Scanner;

public class TP15 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int sommeTab1 = 0;
        int sommeTab2 = 0;
        int sommeTab3 = 0;
        int sommeTotal = 0;


        System.out.println("Entrez la taile du tableau 1");
        int tailleTab1 = clavier.nextInt();
        int tableau1[] = new int[tailleTab1];

        System.out.println("Entrez la taile du tableau 2");
        int tailleTab2 = clavier.nextInt();
        int tableau2[] = new int[tailleTab2];

        System.out.println("Entrez la taile du tableau 3");
        int tailleTab3 = clavier.nextInt();
        int tableau3[] = new int[tailleTab3];

        for (int i = 0; i < tableau1.length; i++) {
            System.out.println("Entrez une valeur dans le tableau 1 ");

            tableau1[i] = clavier.nextInt();

        }
        for (int i = 0; i < tableau2.length; i++) {
            System.out.println("Entrez une valeur dans le tableau 2 ");

            tableau2[i] = clavier.nextInt();
        }

        for (int i = 0; i < tableau3.length; i++) {
            System.out.println("Entrez une valeur dans le tableau 3 ");

            tableau3[i] = clavier.nextInt();
        }

        System.out.println("Tableau 1 = " + Arrays.toString(tableau1));
        System.out.println("Tableau 2 = " + Arrays.toString(tableau2));
        System.out.println("Tableau 3 = " + Arrays.toString(tableau3));

        for (int j = 0; j < tableau1.length; j++) {
            if (tableau1[j] % 3 == 0) {
                sommeTab1 = sommeTab1 + tableau1[j];
            }
        }
        for (int j = 0; j < tableau2.length; j++) {
            if (tableau2[j] % 3 == 0) {
                sommeTab2 = sommeTab2 + tableau2[j];
            }
        }

        for (int j = 0; j < tableau3.length; j++) {
            if (tableau3[j] % 3 == 0) {
                sommeTab3 = sommeTab3 + tableau3[j];
            }
        }

        sommeTotal = sommeTab1 + sommeTab2 + sommeTab3;
        System.out.println("La somme des multiple de 3  = " + sommeTotal);

    }


}

