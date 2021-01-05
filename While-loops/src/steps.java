import java.util.Scanner;

public class steps{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=10000;
        String s = scanner.nextLine();
        int obshto =0;

        while(true){
            if(s.equals("Going home")){
                int d = Integer.parseInt(scanner.nextLine());
                obshto+=d;
                if(obshto>=a){
                    int g=obshto-a;
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!",g);
                    break;
                }
                else{
                    int g=a-obshto;
                    System.out.printf("%d more steps to reach goal.",g);
                    break;
                }
            }
            int stupki = Integer.parseInt(s);
            obshto=obshto+stupki;
            if(obshto>=a){
                int g=obshto-a;
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!",g);

                break;
            }

               s = scanner.nextLine();


        }
    }
}
