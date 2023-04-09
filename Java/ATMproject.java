import java.util.Scanner;
public class ATMproject {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        
        while (right > 0) {
            System.out.print("User Name :");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, Welcome to the Coding Bank!");
                
                do {
                    System.out.println("1-Deposit\n" + "2-Withdrawal\n" + "3-Search Balance\n" + "4-Log Out\n");
                    System.out.print("Please select the action you want to do : ");
                    select = input.nextInt();
                    
                    switch (select) {
                        case 1:
                        System.out.print("Amount of money : ");
                        int price = input.nextInt();
                        balance += price;
                            break;
                        
                        case 2:
                        System.out.print("Amount of money : "+"\n");
                        price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Insufficient balance."+ "\n");
                        } else {
                            balance -= price;
                        }
                            break;
                        
                            case 3:
                            System.out.println("Your balance: " + balance +"\n");
                            break;
                        default:
                            break;
                    }
                    
                } while (select != 4);
                
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your remaining right : " + right);
                }
            }
        }
    }
}
