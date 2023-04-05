import java.util.Scanner;
public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k,total=1;

        System.out.print("Enter the number to be exponentiated exponent : ");
        n=input.nextInt();
        
        System.out.print("Enter the exponent : ");
        k=input.nextInt();

        for(int i=0; i<k; i++){
            total*=n;
        }
        System.out.print("Result: "+ total);

    }
}
