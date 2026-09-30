// initialize While (condition) { Operations; }
import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        // --------------------------------------------------
        int temp = 0;
        int count = 0;
        // --------------------------------------------------
        // int sum = 0;
        // int temp = 0;
        // --------------------------------------------------
        // int count = 0;
        // --------------------------------------------------
    //     for(int i=2; i<n-1; i++){
    //         if(n%i==0){
    //             count++;
    //         }
    //     }
    //     if(count != 0){
    //         System.out.println(n + " is Not Prime");
    //     } else {
    //         System.out.println(n + " is Prime");
    //     }
    // -----------------------------------------------------------
    //     for(int i = 2; i <= 100; i++){
    //         if(n%i == 0){
    //             count++;
    //         }
    //     if(count > 2){
    //         System.out.println(n + " is Composite");
    //     } else{
    //         System.out.println(n + " is Not Composite");
    //     }
    // -----------------------------------------------------------
    //     while(n>0){
    //     temp = n%10;
    //     sum = sum + temp;
    //     n = n/10;
    // }
    // System.out.println("Sum of Digits: " + sum);
    // -----------------------------------------------------------
    while(n>0){
        temp = n%10;
        for(int i=2; i<n-1; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count != 0){
            System.out.println(n + " Composite");
        } else {
            System.out.println(n + " is Prime");
        }
    }
}
}