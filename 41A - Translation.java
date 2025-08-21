import java.util.*;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        
        if(s.length() != t.length()) {
            System.out.println("NO");
            return;
        }
        
        int n = s.length();
        boolean match = true;
        
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) != t.charAt(n - 1 - i)) {
                match = false;
                break;
            }
        }
        
        if(match) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
