import java.util.Scanner;

public class password{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        String parola = scanner.nextLine();
        while(true){
            String a = scanner.nextLine();
            if(a.equals(parola)){
                System.out.println("Welcome "+ ime +"!");
                break;
            }
        }
    }
}
