import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String userName, password, newPassword, x;

        Scanner input= new Scanner(System.in);

        System.out.print("Enter your username: ");
        userName = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("You are logged in.");
        } else {
            System.out.println("Your information is incorrect !");

            System.out.print("Do you want to reset your password ? (Yes: Y , No: N) ");
            x = input.nextLine();

                if(x.equals("Y")){
                    System.out.println("Enter your new password ?");
                    newPassword = input.nextLine();
                        
                    if(newPassword.equals("java123")) {
                         System.out.println("Could not create password, please enter another password.");
                    }else {
                        System.out.println("Password created");
                    }
                }

        }
    }
}