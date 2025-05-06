import java.util.*;

class RemoveOutermostParenthesis {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter parentheses to remove the outermost parenthesis :");
        String s = sc.nextLine();

        String ans = removeOuterParentheses(s);
        System.out.println("String after removing parenthesis : " + ans);
    }

    public static String removeOuterParentheses(String s) {
        int len = s.length();
        if(len <= 2){
            return "";
        }

        int cnt =1;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<len; i++){
            if(s.charAt(i) == '('){
                cnt++;
                if(cnt >= 2) {
                    sb.append('(');
                }
            }
            else{
                if(cnt >= 2){
                    sb.append(')');
                    
                }
                cnt--;
            }
        }

        return sb.toString();
    }
}