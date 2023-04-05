import java.util.Scanner;
public class divisibleNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,sum=0,i,t=0;
        double average=0;

        System.out.print("Enter number: ");
        num=input.nextInt();

        for(i=0;i<=num;i++){
            if(i%3==0 && i%4==0){
                sum+=i;
                t++;
            }
            average=sum/t;
        }
        
        System.out.println("Average of numbers divisible by 3 and 4 from the numbers up to the entered number: "+ average);
    }
}
