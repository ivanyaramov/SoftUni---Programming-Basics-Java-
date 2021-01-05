import java.util.Scanner;

public class oldLibrary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String m=a;
        int i=0;
        while(!a.equals("No More Books")){
             a = scanner.nextLine();

             if(a.equals(m)){
                 System.out.printf("You checked %d books and found it.",i);
                 break;
             }
             i++;


        }
        if(a.equals("No More Books")){
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",i-1);
        }
    }
}
