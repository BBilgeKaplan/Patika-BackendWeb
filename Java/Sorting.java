import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.print("First number: ");
        a=input.nextInt();

        System.out.print("Second number: ");
        b=input.nextInt();

        System.out.print("Third number: ");
        c=input.nextInt();

        if((a>b) && (a>c)){
            if(b>c){
                System.out.println("a>b>c");
            }else {
                System.out.println("a>c>b");
            }
        }else if((b>a) && (b>c)){
            if(a>c){
                System.out.println("b>a>c");
            }else {
                System.out.println("b>c>a");
            }
        }

    }
}
