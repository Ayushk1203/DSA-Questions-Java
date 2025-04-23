import java.util.*;

public class reverseNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rem = 0;
        int rn = 0;
        while(n != 0){
            rem = n%10;
            rn = (rn * 10) + rem;
            n = n/10;
        }
        System.out.println(rn);
    }
}

