import java.util.Scanner;

public class storeForFruitAndVegetables{
    public static void main(String[] args) {
//        Плодовете &quot;fruit&quot; са banana, apple, kiwi, cherry, lemon и grapes
// Зеленчуците &quot;vegetable&quot; са tomato, cucumber, pepper и carrot
// Всички останали са &quot;unknown&quot;
//        Да се изведе &quot;fruit&quot;, &quot;vegetable&quot; или &quot;unknown&quot; според въведения продукт.
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if(a.equals("banana") || a.equals("apple") || a.equals("kiwi") || a.equals("cherry") || a.equals("lemon")|| a.equals("grapes")){
            System.out.println("fruit");
        }
        else if(a.equals("tomato") || a.equals("cucumber") || a.equals("pepper") || a.equals("carrot")){
            System.out.println("vegetable");
        }
        else{
            System.out.println("unknown");
        }
    }
}
