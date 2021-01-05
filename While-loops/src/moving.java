import java.util.Scanner;

public class moving{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        int volume=a*b*c;
        int sum=0;
        while(!s.equals("Done")){
            int d = Integer.parseInt(s);
            sum+=d;
            if(sum>volume){
                int g=sum-volume;
                System.out.printf("No more free space! You need %d Cubic meters more.",g);
                break;
            }

            s = scanner.nextLine();


        }
        if(sum<=volume){
            int g=volume-sum;
            System.out.printf("%d Cubic meters left.",g);
        }

    }
}
