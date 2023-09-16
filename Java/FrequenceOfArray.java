import java.util.Arrays;

public class FrequenceOfArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            int counter = 1;
            while(i+1<arr.length && arr[i]==arr[i+1]){
                i++;
                counter++;
            }
            System.out.println(arr[i] + " appears " + counter + " times");
        }
    }
}
