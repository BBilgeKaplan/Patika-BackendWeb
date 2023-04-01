import java.util.Scanner;

public class KDVcalculate {
    public static void main(String[] args) {
        double money, KDVamount, KDVrate, total;
       
        Scanner input= new Scanner(System.in);
        
        System.out.print("ücret tutarını giriniz:");
        money = input.nextDouble();

        KDVrate= (money>=0) && (money<=1000) ? 0.18 : 0.8 ;  
        KDVamount=money*KDVrate;
        total=money+KDVamount;

        System.out.println("Price without KDV: " + money);
        System.out.println("KDV rate: "+ KDVrate);
        System.out.println("KDV amount: "+ KDVamount);
        System.out.println("Price with KDV: "+total);
    }
}