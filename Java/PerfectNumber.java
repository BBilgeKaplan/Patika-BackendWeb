import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,sum=0;

        System.out.print("Enter number: ");
        n1=input.nextInt();

        for(int i=1; i<=n1;i++ ){
            if(n1%i==0){
                sum+=i;
            }
        }
        if((sum-n1)==n1){
            System.out.println(n1 + " is a perfect number.");
        }else{
            System.out.println(n1 + " is not perfect number.");
        }
    }
}
