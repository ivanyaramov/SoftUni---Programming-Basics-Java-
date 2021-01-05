import java.util.Scanner;

public class summerClothing{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String b = scanner.nextLine();
        String outfit = "b";
        String shoes = "c";
       if(b.equals("Morning")){
           if(a>=10 && a<=18) {
               outfit = "Sweatshirt";
               shoes = "Sneakers";
           }
           else if(a>18 && a<=24){
               outfit="Shirt";
               shoes="Moccasins";
           }
           else if(a>=25){
               outfit="T-Shirt";
               shoes="Sandals";
           }

       }

        else if(b.equals("Afternoon")){
            if(a>=10 && a<=18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(a>18 && a<=24){
                outfit="T-Shirt";
                shoes="Sandals";
            }
            else if(a>=25){
                outfit="Swim Suit";
                shoes="Barefoot";
            }

        }


        else if(b.equals("Evening")){
            if(a>=10 && a<=18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if(a>18 && a<=24){
                outfit="Shirt";
                shoes="Moccasins";
            }
            else if(a>=25){
                outfit="Shirt";
                shoes="Moccasins";
            }

        }

        System.out.printf("It's %d degrees, get your %s and %s.",a,outfit,shoes);
    }
}
