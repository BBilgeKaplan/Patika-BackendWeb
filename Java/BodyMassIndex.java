import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        int weight;
        double height,BodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        height=input.nextDouble();

        System.out.print("Please enter your weight: ");
        weight=input.nextInt();

        BodyMassIndex= weight / (height*height);

        System.out.println("Your body mass index: "+ BodyMassIndex);
    }
}