import java.util.Scanner;

public class cleverOrNot{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vuzrast = Integer.parseInt(scanner.nextLine());
        double peralnq = Double.parseDouble(scanner.nextLine());
        int igrachkacena = Integer.parseInt(scanner.nextLine());
        int igrachki = 0;
        int pariputi=0;
        int pari=0;
        int y=0;
        for(int i=1;i<=vuzrast;i++){
            if(i%2==1){
                igrachki+=1;
            }
            else{
                pariputi+=1;
            }
        }
        for (int i=1;i<=pariputi;i++){

            y=y+10;
            pari=pari+y;
        }
        pari=pari-pariputi;
        pari=pari+igrachki*igrachkacena;
        if(pari>=peralnq){
            double z=pari-peralnq;
            System.out.printf("Yes! %.2f",z);
        }
        else{
            double z=peralnq-pari;
            System.out.printf("No! %.2f",z);
        }
    }
}
