import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age,distance,direction;
        double amount,ageDiscount,roundDiscount,discountedAmount,total=0;

        System.out.print("Enter the distance in km : ");
        distance=input.nextInt();
        System.out.print("Enter your age : ");
        age=input.nextInt();
        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip) : ");
        direction=input.nextInt();

        if(distance>0 && age>0 && direction==1 || direction==2){

            amount=distance*0.10;
            if(age<12){
                ageDiscount=amount*0.5;
                discountedAmount=amount-ageDiscount;
                total=discountedAmount;
                if(direction==2){
                    roundDiscount=discountedAmount*0.2;
                    total=(discountedAmount-roundDiscount)*2;

                }
            }
            else if(age>=12 && age<25){
                ageDiscount=amount*0.1;
                discountedAmount=amount-ageDiscount;
                total=discountedAmount;
                if(direction==2){
                    roundDiscount=discountedAmount*0.2;
                    total=(discountedAmount-roundDiscount)*2;

                }
            }
            else if(age>65){
                ageDiscount=amount*0.3;
                discountedAmount=amount-ageDiscount;
                total=discountedAmount;
                if(direction==2){
                    roundDiscount=discountedAmount*0.2;
                    total=(discountedAmount-roundDiscount)*2;

                }
            }
            else{
                total = amount;
            }
            System.out.println("Total: "+ total);
        }else {
            System.out.println("You entered invalid data.");
        }
        
    }
}
