import java.util.*;

public class WordCapitalization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = str.substring(0,1);
        String str2 = str1.toUpperCase();
        
        if(str.charAt(0)==str2.charAt(0)){
            System.out.print(str);
        }

        else{
            System.out.print(str2+str.substring(1, str.length()));
        }
    }
}
