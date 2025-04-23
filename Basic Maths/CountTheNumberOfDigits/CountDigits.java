import java.util.*;

public class CountDigits{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        int count = 1;
        int rem = 0;
        while(n != 0){
            rem = rem % 10;
            n =n /10;
            count+=1;
        }

        System.out.print("Number of digits in the number are : " + count);
    }
}