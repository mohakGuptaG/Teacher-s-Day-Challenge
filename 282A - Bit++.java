import java.util.*;

public class Bitplusplus{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int ans = 0;

        String str;

        for(int i = 0; i<x; i++){
            str = sc.next();
            if(str.charAt(0)=='+'||str.charAt(str.length()-1)=='+'){
                ans = ans + 1;
            }

            else {
                ans = ans - 1;
            }        
        }

        System.out.println(ans);
    }
}
