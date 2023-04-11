import java.util.Scanner;

public class FibonacciRecursive {
    static int Fibonacci(int num){
        int total=0;
        if(num == 1){
         return 0;
        }
        if(num == 2){
         return 1;
        }
        else{ 
          return (Fibonacci(num-1) + Fibonacci(num-2));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number=input.nextInt();
        for(int i=1; i<=number; i++){
            System.out.print(Fibonacci(i) + ",");
        }
    }
}
