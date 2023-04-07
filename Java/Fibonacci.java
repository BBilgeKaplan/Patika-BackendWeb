import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1=0,n2=1,tem=0,sum=0,x;
        
        System.out.print("Enter number: ");
        x=input.nextInt();

        System.out.print(n1 + " " + n2 + " ");
        sum=n1+n2;
        for(int i=0; i<=x; i++){
           System.out.print( + sum + " ");
           tem=n2;
           n2=sum;
           sum+=tem;
        }
    }
}
