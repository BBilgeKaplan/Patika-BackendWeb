import java.util.Scanner;

public class Greengrocer {
    public static void main(String[] args) {
        double tomato,apple,banana,eggplant,pear, t=1.11 ,a=3.67 ,b=0.95 , e=5.0 , p=2.14, total  ;

        Scanner inp = new Scanner(System.in);

        System.out.print("How many kilos of apples:");
        apple = inp.nextInt();
        System.out.print("How many kilos of tomatoes:");
        tomato = inp.nextInt();
        System.out.print("How many kilos of banana:");
        banana = inp.nextInt();
        System.out.print("How many kilos of eggplant:");
        eggplant = inp.nextInt();
        System.out.print("How many kilos of pear:");
        pear = inp.nextInt();

        apple=apple*a;
        banana=banana*b;
        tomato=tomato*t;
        eggplant=eggplant*e;
        pear=pear*p;
        total=tomato+apple+banana+eggplant+pear;

        System.out.println("Total: "+ total);
    }
    
}
