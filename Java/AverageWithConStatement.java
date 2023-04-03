import java.util.Scanner;

public class AverageWithConStatement {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int mat,phy,chm,mus,tur,his, sum=0;
       
        System.out.print("Math score :");
        mat = inp.nextInt();
        if((mat <=100) && (mat>=0)){ sum+=mat; }

        System.out.print("Chemistry score :");
        chm = inp.nextInt();
        if((chm <=100) && (chm>=0)){ sum+=chm; }

        System.out.print("Music score :");
        mus = inp.nextInt();
        if((mus <=100) && (mus>=0)){ sum+=mat; }

        System.out.print("Turkish score :");
        tur = inp.nextInt();
        if((tur <=100) && (tur>=0)){ sum+=mat; }

        System.out.print("History score :");
        his = inp.nextInt();
        if((his <=100) && (his>=0)){ sum+=mat; }

        double average=sum/5;
        if(average<=55){
            System.out.println("You failed.");
            
        }else{
            System.out.println("You passed.");
            
        }
        System.out.println("Your average:"+ average);

    }
}