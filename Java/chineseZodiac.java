import java.util.Scanner;

public class chineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthday,rem;

        System.out.print("Enter your month of birth");
        birthday=input.nextInt();

        rem = birthday % 12;

        if(rem==1){
            System.out.println("Your Chinese Zodiac Sign: Rooster");

        }else if(rem==2){
            System.out.println("Your Chinese Zodiac Sign: Dog");

        }else if(rem==3){
            System.out.println("Your Chinese Zodiac Sign: Pig");
            
        }else if(rem==4){
            System.out.println("Your Chinese Zodiac Sign: Mouse");
            
        }else if(rem==5){
            System.out.println("Your Chinese Zodiac Sign: Ox");
            
        }else if(rem==6){
            System.out.println("Your Chinese Zodiac Sign: Tiger");
            
        }else if(rem==7){
            System.out.println("Your Chinese Zodiac Sign: Rabbit");
            
        }else if(rem==8){
            System.out.println("Your Chinese Zodiac Sign: Dragon");
            
        }else if(rem==9){
            System.out.println("Your Chinese Zodiac Sign: Snake");
            
        }else if(rem==10){
            System.out.println("Your Chinese Zodiac Sign: Horse");
            
        }else if(rem==11){
            System.out.println("Your Chinese Zodiac Sign: Sheep");

        }else if(rem==0){
            System.out.println("Your Chinese Zodiac Sign: Monkey");
        }

        
    }
}
