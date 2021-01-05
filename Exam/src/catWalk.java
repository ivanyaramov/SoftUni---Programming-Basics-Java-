import java.util.Scanner;

public class catWalk{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.parseInt(scanner.nextLine());
        int br = Integer.parseInt(scanner.nextLine());
        int kalorii = Integer.parseInt(scanner.nextLine());
        double a=kalorii/2.0;
        if(min*br*5>=a){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",min*br*5);
        }
        else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",min*br*5);
        }
    }
}
