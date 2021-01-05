import java.util.Scanner;

public class illidan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        if(a*b>=c){
            System.out.printf("Illidan has been slain! You defeated him with %d points.",a*b-c);
        }
        else{
            System.out.printf("You are not prepared! You need %d more points.",c-a*b);
        }

    }
}
