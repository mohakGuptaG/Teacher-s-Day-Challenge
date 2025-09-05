import java.util.*;
 
public class CapsLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        
        boolean shouldFix = false;
        
        if(str.equals(str.toUpperCase())){
            shouldFix = true;
        }
        else if(Character.isLowerCase(str.charAt(0)) && 
                str.substring(1).equals(str.substring(1).toUpperCase())){
            shouldFix = true;
        }
        
        if(shouldFix){
            StringBuilder result = new StringBuilder();
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(Character.isUpperCase(c)){
                    result.append(Character.toLowerCase(c));
                } else {
                    result.append(Character.toUpperCase(c));
                }
            }
            System.out.println(result.toString());
        } else {
            System.out.println(str);
        }
    }
}
