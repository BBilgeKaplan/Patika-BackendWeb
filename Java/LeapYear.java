import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year,rem;

        System.out.print("Enter year: ");
        year=input.nextInt();

        rem=year%4;

        if(year%100==0) { 
            if(year%400==0){
                System.out.println(year + " " +"is leap year");
            }else {
                  System.out.println(year + " " +"is not a leap year");
            }
            
        }else{
            if(rem==0){
                System.out.println(year + " " +"is leap year");
            }else {
                System.out.println(year + " " +"is not a leap year");
            }

        }
        
    }
}
