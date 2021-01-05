import java.util.Scanner;

public class store{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a=scanner.nextLine();
        String b=scanner.nextLine();
        double c = Double.parseDouble(scanner.nextLine());
        if(b.equals("Sofia")){
            if(a.equals("coffee")){
                System.out.println(c*0.5);
            }
            else if(a.equals("water")){
                System.out.println(c*0.8);
            }
            else if(a.equals("beer")){
                System.out.println(c*1.2);
            }
            else if(a.equals("sweets")){
                System.out.println(c*1.45);
            }
            else if(a.equals("peanuts")){
                System.out.println(c*1.6);
            }
        }
        if(b.equals("Plovdiv")){
            if(a.equals("coffee")){
                System.out.println(c*0.4);
            }
            else if(a.equals("water")){
                System.out.println(c*0.7);
            }
            else if(a.equals("beer")){
                System.out.println(c*1.15);
            }
            else if(a.equals("sweets")){
                System.out.println(c*1.30);
            }
            else if(a.equals("peanuts")){
                System.out.println(c*1.50);
            }
        }

        if(b.equals("Varna")){
            if(a.equals("coffee")){
                System.out.println(c*0.45);
            }
            else if(a.equals("water")){
                System.out.println(c*0.70);
            }
            else if(a.equals("beer")){
                System.out.println(c*1.1);
            }
            else if(a.equals("sweets")){
                System.out.println(c*1.35);
            }
            else if(a.equals("peanuts")){
                System.out.println(c*1.55);
            }
        }

    }
}
