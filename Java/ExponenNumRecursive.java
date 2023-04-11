import java.util.Scanner;

public class ExponenNumRecursive {
    static int Expo(int n, int e){
        if(e==0){
            return 1;
        }
        if(e>0){
            return n*(Expo(n, e-1));
        }
        else return 0;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,e;
        System.out.print("Enter number : ");
        n=inp.nextInt();
        System.out.print("Enter the number to be exponentiated exponent : ");
        e=inp.nextInt();
        System.out.println(Expo(n, e)); 

    }
}
