import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int a,b,c,u,perimeter;
        double area;
        Scanner input= new Scanner(System.in);

        System.out.print("1. side: ");
        a=input.nextInt();

        System.out.print("2. side: ");
        b=input.nextInt();
        
        System.out.print("3. side: ");
        c=input.nextInt();

        perimeter=a+b+c;
        u=perimeter/2;
        area=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Area of the triangle: "+ area);
    }
}
