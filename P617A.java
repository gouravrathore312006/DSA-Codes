import java.util.Scanner;
public class P617A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();
        int count = 0;
        while(step > 0){
            if(step >= 5){
                step -= 5;
                count++;
            }
            else if(step >= 4){
                step -= 4;
                count++;
            }
            else if(step >= 3){
                step -= 3;
                count++;
            }
            else if(step >= 2){
                step -= 2;
                count++;
            }
            else{
                step -= 1;
                count++;
            }
        }
        System.out.println(count);
    }
}