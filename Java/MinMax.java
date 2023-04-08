import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,tem=0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        
        System.out.print("How many numbers will you enter: ");
        x=input.nextInt();

        for(int i=1; i<=x; i++){
            System.out.print(i +". number : ");
            tem=input.nextInt(); 
             
            if(tem<min){
                min=tem;
            }
            if(tem>max){
                max=tem;
            }
        }
        System.out.println("MAX number: " + max);
        System.out.println("MIN number: "+ min);
    }
}
