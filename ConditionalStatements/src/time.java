import java.util.Scanner;

public class time {
    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);

    int a = Integer.parseInt(scanner.nextLine());
    int b = Integer.parseInt(scanner.nextLine());
    if (b+15>=60)
    {a=a+1;
    b=15-(60-b);
            if(b<=9&&a<24)
            {
                System.out.println(a+":0"+b);
            }
            else if(b>9&&a<24) {

                System.out.println(a + ":" + b);
            }
            else if(b<=9&&a==24)
            {
                System.out.println("0:0"+b);
            }
            else if(b>9&&a==24) {

                System.out.println("0:" + b);
            }

    }
    else{
        b=b+15;
        System.out.println(a+":"+b);

    }
}

}
