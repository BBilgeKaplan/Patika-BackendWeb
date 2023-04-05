import java.util.Scanner;
public class AddingEvenAndMultiplesOf4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum=0,i,t=0;
        
        do{
            System.out.print("Enter number: ");
            num=input.nextInt();
            if(num%2==0 && num%4==0){
                sum+=num;
            }
        }while(num%2==0);
        
        System.out.println("Sum of even and multiple of 4 from the entered values : "+ sum);

    }
}
