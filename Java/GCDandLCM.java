import java.util.Scanner;
public class GCDandLCM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,gcd=0;

        System.out.print("Enter number: ");
        n1=input.nextInt();
        System.out.print("Enter another number: ");
        n2=input.nextInt();
        System.out.println("- Greatest Common Divisor -");
     
        /*  
        for(int i=1; i<=n1; i++){
            if(n1%i==0 && n2%i==0){
                System.out.println(i);
                gcd=i;
            }
        }
        */

        int j=n1;
        while(j>=1){
            if(n1%j==0 && n2%j==0){
                System.out.println(j);
                gcd=j;
                break;
            } j--;
        }
        System.out.println("- Least Common Multiple -");

        System.out.println((n1*n2/gcd));
    }
}