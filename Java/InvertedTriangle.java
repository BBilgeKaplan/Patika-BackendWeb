import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1;

        System.out.print("Enter number: ");
        n1=input.nextInt();
        for(int i=n1; i>=0; i--){
            for(int j=(n1-i); j>=1;j--){
                System.out.print(" ");
            }for (int k = (2 * i + 1); k >=1 ; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
