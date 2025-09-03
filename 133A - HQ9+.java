import java.util.*;

public class Hq9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='H' || str.charAt(i)=='Q' || str.charAt(i)=='9'){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
