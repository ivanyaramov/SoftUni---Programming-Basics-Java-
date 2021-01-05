import java.util.Scanner;

public class divisionWithoutResidue{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double na2=0;
        double na3=0;
        double na4=0;
        for(int i=1;i<=n;i++){
            int a = Integer.parseInt(scanner.nextLine());
            if(a%2==0){
                na2+=1;
            }
            if(a%3==0){
                na3+=1;
            }
            if(a%4==0){
                na4+=1;
            }
        }
        double p1=(na2/n)*100;
        double p2=(na3/n)*100;
        double p3=(na4/n)*100;
        System.out.printf("%.2f",p1);
        System.out.println("%");
        System.out.printf("%.2f",p2);
        System.out.println("%");
        System.out.printf("%.2f",p3);
        System.out.println("%");
    }
}
