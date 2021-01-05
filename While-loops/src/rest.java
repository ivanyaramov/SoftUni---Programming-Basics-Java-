import java.util.Scanner;

public class rest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ekskurziq = Double.parseDouble(scanner.nextLine());
        double nalichni = Double.parseDouble(scanner.nextLine());
        String s = " ";
        double suma = 0;
        int br=0;
        int br1=0;

        while(nalichni<ekskurziq){
            if(nalichni>ekskurziq){
                System.out.println("You saved the money for 0 days.");
                break;
            }
             s = scanner.nextLine();
            suma = Double.parseDouble(scanner.nextLine());
            if(s.equals("spend")){
                br1++;
                nalichni=nalichni-suma;
                if(nalichni<0){
                    nalichni=0;
                }
            }
            else if(s.equals("save")){
                br1=0;
                nalichni=nalichni+suma;
            }
            br++;
            if(nalichni>=ekskurziq){
                System.out.printf("You saved the money for %d days.",br);
                break;
            }
            else if(br1>=5){
                System.out.println("You can't save the money.");
                System.out.println(br);
                break;
            }


        }
    }
}
