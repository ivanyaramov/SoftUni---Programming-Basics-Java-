import java.util.Scanner;

public class addres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double b=Double.parseDouble(scanner.nextLine());
        String a = scanner.nextLine();
        if (b>=16)
        {
            if (a.equals("f")){
                System.out.println("Ms.");
            }
            else if (a.equals("m")){
                System.out.println("Mr.");
            }
        }
        else if (b<16)
        {
            if (a.equals("f")){
                System.out.println("Miss");
            }
            else if (a.equals("m")){
                System.out.println("Master");
            }
        }
    }
}
