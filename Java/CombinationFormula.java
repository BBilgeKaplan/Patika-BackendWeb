import java.util.Scanner;

public class CombinationFormula {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,num2,sum=0,i=1,n=1,r=1,n_r=1,com=0;

        System.out.print("Enter first number : ");
        num=input.nextInt();
        System.out.print("Enter second number : ");
        num2=input.nextInt();

        for(i=1; i<=num; i++){
            n*=i;
        }
        for(i=1; i<=num2; i++){
            r*=i;
        }
        for(i=1; i<=num-num2; i++){
            n_r*=i;
        }
        com=n/(r*n_r);

        System.out.print("Combination : "+ com);
    }
}
