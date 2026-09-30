import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[5];

        for(int i=0; i<n; i++){
            System.out.print("Enter the No. "); 
            arr[i] = sc.nextInt();
        }
        System.out.print("\n");
        System.out.println("Array Elements");
        for(int j=0; j<n; j++){
            System.out.print(arr[j] + ",");
        }
        System.out.println("\n");
        System.out.println("Length of the Array: "+arr.length);
    }
}
