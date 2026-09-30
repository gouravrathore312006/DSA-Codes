import java.util.Scanner;
public class Day5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limak's weight: ");
        int limakW = sc.nextInt();
        System.out.print("Enter Bob's weight: ");
        int bobW = sc.nextInt();

        int count = 0;
        while(limakW <= bobW){
            limakW = limakW * 3;
            bobW = bobW * 2;
            count++;
            if(limakW > bobW){
                System.out.println(count);
            }
        }
    }
}
