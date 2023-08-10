import java.util.Scanner;

public class TaxCalculate {
    public static void main(String[] args) {
        double money, TaxAmount, TaxRate, total;
       
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter the amount: ");
        money = input.nextDouble();

        TaxRate= (money>=0) && (money<=1000) ? 0.18 : 0.8 ;  
        TaxAmount=money*TaxRate;
        total=money+TaxAmount;

        System.out.println("Price without Tax: " + money);
        System.out.println("Tax rate: "+ TaxRate);
        System.out.println("Tax amount: "+ TaxAmount);
        System.out.println("Price with Tax: "+total);
    }
}
