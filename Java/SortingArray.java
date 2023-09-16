import java.util.Scanner;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the lenght of the array: ");
        int n = sc.nextInt();
        int[] list = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". Element: ");
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
