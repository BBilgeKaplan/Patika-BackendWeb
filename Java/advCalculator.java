import java.util.Scanner;
public class advCalculator {
        
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter:");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter:");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter the divisor 0.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base value :");
        int base = scan.nextInt();
        System.out.print("Enter the exponent value :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = scan.nextInt();
        System.out.print("Enter mod value :");
        int m = scan.nextInt();
        if(n>0 && m>0){
           int result=(n % m);  
           System.out.println(result);         
        }else if(m==0){
            System.out.println("You cannot enter the divisor 0."); 
        }else{
            System.out.println("You entered an incorrect value");       
        }
    }

    static void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first side of the rectangle : :");
        int x = scan.nextInt();
        System.out.print("Enter the second side of the rectangle :");
        int y = scan.nextInt();
        int result,area,perimeter=0;
        perimeter= 2*(x+y);
        System.out.println("Perimeter of rectangle : " + perimeter);
        area=(x*y);
    }

     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
        + "2- Subtraction\n" 
        + "3- Multiplication\n" 
        + "4- Division\n" 
        + "5- Exponential Calculation\n" 
        + "6- Factorial Calculation\n" 
        + "7- Modification\n" 
        + "8- Rectangular Area and Perimeter Calculation\n" 
        + "0- Log Out";

        do {
            System.out.println(menu);
            System.out.print("Please select an action :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                default:
                    System.out.println("You entered an incorrect value, try again.");
            }
        } while (select != 0);

    }
}
