import java.util.Scanner;

public class histogram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double pod200=0;
        double mejdu200i399=0;
        double mejdu400i599=0;
        double mejdu60i799=0;
        double nad800=0;
        for(int i=0;i<n;i++){
            int a = Integer.parseInt(scanner.nextLine());
            if(a<200){
                pod200+=1;
            }
            else if(a>=200 && a<=399){
                mejdu200i399+=1;
            }
            else if(a>=400&&a<=599){
                mejdu400i599+=1;
            }
            else if(a>=600 && a<=799){
                mejdu60i799+=1;
            }
            else{
                nad800+=1;
            }

        }
        double b=(pod200/n)*100;
        double c=(mejdu200i399/n)*100;
        double d=(mejdu400i599/n)*100;
        double e=(mejdu60i799/n)*100;
        double f=(nad800/n)*100;


        System.out.printf("%.2f",b);
        System.out.println("%");
        System.out.printf("%.2f",c);
        System.out.println("%");
        System.out.printf("%.2f",d);
        System.out.println("%");
        System.out.printf("%.2f",e);
        System.out.println("%");
        System.out.printf("%.2f",f);
        System.out.println("%");

    }
}
