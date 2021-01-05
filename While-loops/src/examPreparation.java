import java.util.Scanner;

public class examPreparation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        int i=0;
        int d=0;
        int br=0;
        String last=" ";
        while(!s.equals("Enough")){
            int b = Integer.parseInt(scanner.nextLine());

            if(b<=4){
                i++;
            }
            if(i==a){
                System.out.printf("You need a break, %d poor grades.",i);
                break;
            }
            d=d+b;
            br++;
            last=s;
            s = scanner.nextLine();


        }
        if(s.equals("Enough")){
            double average=d*1.0/br;
            System.out.printf("Average score: %.2f",average);
            System.out.println();
            System.out.printf("Number of problems: %d",br);
            System.out.println();
            System.out.printf("Last problem: %s",last);


        }
    }
}
