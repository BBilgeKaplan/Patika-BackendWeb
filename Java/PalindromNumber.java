import java.util.Scanner;
public class PalindromNumber {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber=0, lastNum;

        while(temp != 0){
            lastNum = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNum;
            temp /= 10;
        }
        if(number == reverseNumber ){
            return true;
        }else {
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        
        System.out.println(isPalindrom(number));

    }
}
