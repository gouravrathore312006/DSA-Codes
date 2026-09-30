import java.util.*;
import java.lang.*;
import java.io.*;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Your Number: " + x);
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Character.MAX_VALUE);
        //sc.close();
        // ----------------------------------------------------

        if(x%2 == 0 && x > 2){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}

