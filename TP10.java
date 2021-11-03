public class TP10 {
    public static void main(String[] args) {
        for (int i=2; i<=10;i++){
            System.out.printf("Table de multiplication par %d \n ==================================\n",i);

            for (int j=0; j<=10; j++){
                System.out.println( i + "*" + j + "="+ i*j );
            }
        }
    }
}
