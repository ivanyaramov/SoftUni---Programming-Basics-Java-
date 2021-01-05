import java.util.Scanner;

public class foodForPets{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dni = Integer.parseInt(scanner.nextLine());
        double obshto = Double.parseDouble(scanner.nextLine());
        double izqdenkuche=0;
        double izqdenkote=0;
        double biskviti=0;
        double biskviti1=0;
        for(int i=1;i<=dni;i++){
            double kuche = Double.parseDouble(scanner.nextLine());
            double kote = Double.parseDouble(scanner.nextLine());
            izqdenkuche+=kuche;
            izqdenkote+=kote;
            if(i%3==0){
                biskviti=0.1*(kuche+kote);
                biskviti1+=biskviti;
            }


        }
        System.out.printf("Total eaten biscuits: %.0fgr.",biskviti1);
        System.out.println();
        double procentobshto=(izqdenkote+izqdenkuche)/obshto*100;
        System.out.printf("%.2f",procentobshto);
        System.out.print("%");
        System.out.println(" of the food has been eaten.");
        double kotkaobshto=izqdenkote/(izqdenkote+izqdenkuche)*100;
        double kucheobshto=izqdenkuche/(izqdenkote+izqdenkuche)*100;
        System.out.printf("%.2f",kucheobshto);
        System.out.print("%");
        System.out.println(" eaten from the dog.");
        System.out.printf("%.2f",kotkaobshto);
        System.out.print("%");
        System.out.println(" eaten from the cat.");


    }
}
