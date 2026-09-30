import java.util.Arrays;
public class SortArr {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 80};


        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-2]);

        int largest = Integer.MIN_VALUE;
        int sclargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                sclargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > sclargest && arr[i] != largest){
                sclargest = arr[i];
            }
        }
        System.out.println(sclargest);

    }
}