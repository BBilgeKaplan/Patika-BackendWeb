import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        int r,a;
        double pi=3.14, area;

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        r = inp.nextInt();

        System.out.print("Enter the measure of the central angle: ");
        a = inp.nextInt();

        area= (pi*(r*r)*a)/360;

        System.out.println("Area : " + area);
    }
}
