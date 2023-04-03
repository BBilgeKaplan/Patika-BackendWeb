import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        int tem;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        tem=input.nextInt();

        if(tem<5) {
            System.out.println("Ski");
        }else if(tem>=5 && tem<25) {
            if(tem<=15) {
                System.out.println("Cinema");
            }
            if(tem>=15){
                System.out.println("Picnic");
            }
        } else{
            System.out.println("Swim");
        }
    }
}
