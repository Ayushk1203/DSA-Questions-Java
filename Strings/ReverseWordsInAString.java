import java.util.*;

public class ReverseWordsInAString {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();

        int end = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(end >= 0){
            while(end >= 0){
               if(s.charAt(end) != ' '){
                  break;
               }
               end--;
            }

            if(end <0) break;

            int start = end;
            while(start >= 0){
               if(s.charAt(start) == ' '){
                  break;
               }
               start--;
            }

            if (sb.length() > 0) {
                sb.append(' ');
            }
            for(int i=start+1; i<=end; i++){
                sb.append(s.charAt(i));
            }

            end = start-1;
        }
       
        System.out.println("Your resultant string after reversing words order : " + sb);

    }
}