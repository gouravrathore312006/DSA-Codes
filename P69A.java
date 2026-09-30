import java.util.Scanner;

public class P69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int xTotal = 0;
        int yTotal = 0;
        int zTotal = 0;

        while (n-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            xTotal += x;
            yTotal += y;
            zTotal += z;
        }
        sc.close();

        if (xTotal == 0 && yTotal == 0 && zTotal == 0) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}