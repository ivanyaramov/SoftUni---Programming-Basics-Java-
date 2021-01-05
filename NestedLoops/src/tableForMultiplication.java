public class tableForMultiplication{
    public static void main(String[] args) {
        for(int i =1;i<=10;i++){
            for(int k =1;k<=10;k++){
                int suma=i*k;
                System.out.printf("%d * %d = %d",i,k,suma);
                System.out.println();
            }
        }
    }
}
