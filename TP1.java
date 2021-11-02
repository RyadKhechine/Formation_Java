import java.util.Scanner;

public class TP1 {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        double diametre;


        System.out.print("Valeur diametre : ");
        diametre=keyboard.nextDouble();
        double rayon = diametre /2;
        double surface = Math.pow(rayon, 2) * Math.PI;

        System.out.print("La surface =  : "+ surface);


    }
}
