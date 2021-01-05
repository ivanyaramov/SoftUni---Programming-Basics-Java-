import java.util.Scanner;

public class WorkOrRest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if(a.equals("Monday") || a.equals("Tuesday") || a.equals("Wednesday") || a.equals("Thursday") || a.equals("Friday")){
            System.out.println("Working day");
        }
        else if(a.equals("Saturday") || a.equals("Sunday")){
            System.out.println("Weekend");
        }
        else{
            System.out.println("Error");
        }
    }
}
