import java.util.Scanner;

public class RecursiveExercise {
    public static void Method1(int number, int temp){
        if(number>0) {
            System.out.print(number + " ");
            Method1(number-5, temp);
        }else if(number<=0){
             Method2(number,temp);
        }
    }
    public static void Method2(int number, int temp){
         if(temp>=number){
             System.out.print(number + " ");
             Method2(number+5,temp);
         } }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,temp;
        System.out.print("Enter number : ");
        num = inp.nextInt();
        Method1(num,temp=num);
        
    
}
}