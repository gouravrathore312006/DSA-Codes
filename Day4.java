import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        // Using For Loop
        // for(int i=n; i>0; i--){
        //     System.out.print(i);
        // } 

        // Using While Loop
        // int rev = 0;
        // while(n>0){
        //     int temp = n%10;
        //     rev = rev * 10 + temp;
        //     n = n/10;
        // }
        // System.out.println("Reverse of the Number: " + rev);

        // Palindrome Number
        // int p = n;
        // int rev = 0;
        // while(n>0){
        //     int temp = n%10;
        //     rev = rev * 10 + temp;
        //     n = n/10;
        // }
        // if(rev == p){
        //     System.out.println("Palindrome Number");
        // } else {
        //     System.out.println("Not a Palindrome Number");
        // }

        // Do-While Loop
        // int count = 0;
        // int temp = 0;
        // do{
        //     temp = n%10;
        //     if(temp == 7){
        //         count++;
        //     }
        //     n = n/10;
        // }while(n > 0);
        // System.out.println("Count of the Number: " + count);

        int even = 0;
        int odd = 0;
        int temp = 0;
        do{
            temp = n%10;
            if (temp % 2 == 0){
                even++;
            } else {
                odd++;
            }
            n = n/10;
        }while(n > 0);
        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
    }
}
