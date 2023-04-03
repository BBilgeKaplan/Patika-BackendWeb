import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int a, b, x, result=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("First number:");

        a=input.nextInt();
        
        System.out.print("Second number:");
        b=input.nextInt();
        
        System.out.println("1-Addition 2-Subtraction 3-Multiplication 4-Division ");
        x=input.nextInt();

        switch (x) {
            case 1:
                result= a+b;
                break;
            case 2:
                result= a-b;
                break;
            case 3:
                result= a*b;
                break;
            case 4:
                result= a/b;
                break;        
            default: break;
        }

        System.out.println("Your Operation:" + x +" " + "Result: " + result );
        
    }
}