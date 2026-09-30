import java.util.Scanner;
public class P546A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int req = 0;

        for (int i = 1; i<=w; i++){
            req += i*k;
        }
        if(req - n <= 0){
            System.out.print(0);
        }
        else if(req - n > 0){
            System.out.print(req - n);
        }

    }
}
