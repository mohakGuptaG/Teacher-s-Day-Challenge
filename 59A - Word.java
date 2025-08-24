import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String l = s.toLowerCase();

        String u = s.toUpperCase();

        int countl = 0;
        int countu = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==l.charAt(i)){
                countl++;
            }
        }
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==u.charAt(i)){
                countu++;
            }
        }

        if(countl < countu){
            System.out.println(u);
        }

        else{
            System.out.println(l);
        }

    }
}
