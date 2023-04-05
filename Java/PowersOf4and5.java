import java.util.Scanner;

public class PowersOf4and5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num,i;

        System.out.println("printing powers of 4 and 5 up to the entered number");
        System.out.print("Enter number: ");
        num=input.nextInt();

        System.out.println("Powers of 4: ");
        for(i=1; i<=num; i*=4){
            System.out.println(i);
        }

        System.out.println("Powers of 5: ");
        for(i=1; i<=num; i*=5){
            System.out.println(i);
        }

    }
}
