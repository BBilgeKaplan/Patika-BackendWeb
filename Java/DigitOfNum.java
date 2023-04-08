import java.util.Scanner;
public class DigitOfNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=input.nextInt();
        int cnt=0, temp=0,digit,total=0;

        while(number!=0){
            digit=number%10;
            total+=digit;
            number/=10;
        }
        
        System.out.println("The sum of the digits of the entered number: "+total);
    }
}