import java.util.Scanner;

public class fruitStore{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b=scanner.nextLine();
        double c=Double.parseDouble(scanner.nextLine());
        if(b.equals("Monday")|| b.equals("Tuesday") || b.equals("Wednesday") || b.equals("Thursday") || b.equals("Friday")){
            if(a.equals("banana")){
                System.out.printf("%.2f",c*2.5);
            }
            else if(a.equals("apple")){
                System.out.printf("%.2f",c*1.2);
            }
            else if(a.equals("orange")){
                System.out.printf("%.2f",c*0.85);
            }
            else if(a.equals("grapefruit")){
                System.out.printf("%.2f",c*1.45);
            }
            else if(a.equals("kiwi")){
                System.out.printf("%.2f",c*2.7);
            }
            else if(a.equals("pineapple")){
                System.out.printf("%.2f",c*5.5);
            }
            else if(a.equals("grapes")){
                System.out.printf("%.2f",c*3.85);
            }
            else{
                System.out.println("error");
            }

        }



        else if(b.equals("Saturday")|| b.equals("Sunday")){
            if(a.equals("banana")){
                System.out.printf("%.2f",c*2.7);
            }
            else if(a.equals("apple")){
                System.out.printf("%.2f",c*1.25);
            }
            else if(a.equals("orange")){
                System.out.printf("%.2f",c*0.90);
            }
            else if(a.equals("grapefruit")){
                System.out.printf("%.2f",c*1.60);
            }
            else if(a.equals("kiwi")){
                System.out.printf("%.2f",c*3);
            }
            else if(a.equals("pineapple")){
                System.out.printf("%.2f",c*5.6);
            }
            else if(a.equals("grapes")){
                System.out.printf("%.2f",c*4.2);
            }
            else{
                System.out.println("error");
            }

        }
        else{
            System.out.println("error");
        }

    }
}
