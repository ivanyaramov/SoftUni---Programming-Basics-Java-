import java.util.Scanner;

public class invalid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        boolean c;
        if ((a>=100 && a<=200) || a==0){
            c=true;
        }
        else{
            c=false;
        }
        if (c==false){
            System.out.println("invalid");
        }
    }
}
