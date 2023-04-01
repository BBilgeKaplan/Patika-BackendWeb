import java.util.Scanner;
public class AverageCalculate {

    public static void main(String[] args) {
        // declaring variables
        int mat,phy,chm,mus,tur,his;

        Scanner inp = new Scanner(System.in);
        System.out.print("Math score :");
        mat = inp.nextInt();

        System.out.print("Chemistry score :");
        chm = inp.nextInt();
        
        System.out.print("Music score :");
        mus = inp.nextInt();

        System.out.print("Turkish score :");
        tur = inp.nextInt();

        System.out.print("History score :");
        his = inp.nextInt();

        int Sum = (mat + tur + mus + chm + tur + his);
        double Average = Sum/6.0;

        // The ternary operator can be used both ways.
        String Calculate = Average> 60.0 ? "Passed." : "Failed.";
        System.out.println("Your average: " + Average + " " + Calculate);

        /* Or :
        System.out.println("your average :" + average);
        System.out.println(Average >= 60 ? "Passed." : "Failed.");
         */
    }
}