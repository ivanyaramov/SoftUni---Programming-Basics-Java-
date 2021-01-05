import java.util.Scanner;

public class EasterCompetition{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int  a = Integer.parseInt(scanner.nextLine());
        String s = " ";
        int ocenka= 0;
        int ocenkaobshto=0;
        int br=0;
        String ime=" ";
        int max=0;
        String krai="";
        while(true){
            if(br==a){
                break;
            }

            s = scanner.nextLine();
            ime=s;
            while(true) {
                s = scanner.nextLine();
                if (s.equals("Stop")) {
                    break;
                }

                ocenka = Integer.parseInt(s);
                ocenkaobshto += ocenka;
            }
            System.out.printf("%s has %d points.",ime,ocenkaobshto);
            System.out.println();
            if(max<ocenkaobshto){
                System.out.printf("%s is the new number 1!",ime);
                System.out.println();
                max=ocenkaobshto;
                krai=ime;
            }
            ocenkaobshto=0;
            br++;


        }
        System.out.printf("%s won competition with %d points!",krai,max);
    }
}
