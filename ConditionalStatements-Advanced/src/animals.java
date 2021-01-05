import java.util.Scanner;

public class animals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if(a.equals("dog")){
            System.out.println("mammal");
        }
        else if(a.equals("snake") || a.equals("tortoise")|| a.equals("crocodile")){
            System.out.println("reptile");
        }
        else{
            System.out.println("unknown");
        }
    }
}
