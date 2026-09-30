import java.util.*;

public class P1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int temp = n;
            int place = 1;
            int count = 0;
            int digit = 0;

            // Count non-zero digits
            while (temp > 0) {
                digit = temp % 10;

                if (digit != 0) {
                    count++;
                }

                temp = temp / 10;
                place = place * 10;
            }

            System.out.println(count);

            // Print round numbers from left to right
            temp = n;
            place = place / 10;

            while (place > 0) {
                digit = temp / place;

                if (digit != 0) {
                    System.out.print(digit * place + " ");
                }

                temp = temp % place;
                place = place / 10;
            }

            System.out.println();
        }

        sc.close();
    }
}