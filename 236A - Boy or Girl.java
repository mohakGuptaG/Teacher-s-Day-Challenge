//My approach

import java.util.*;

public class BoyOrGirl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Set<Character> charset = new HashSet<>();

        for(char c: str.toCharArray()){
            charset.add(c);
        }

        if(charset.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }

        else{
            System.out.println("IGNORE HIM!");
        }

    }    
        
}



// Better Approach (less execution time, space complexity and better memory efficiency)

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    
    boolean[] seen = new boolean[26]; // For 26 lowercase letters
    int distinctCount = 0;
    
    for (char c : username.toCharArray()) {
        if (!seen[c - 'a']) {
            seen[c - 'a'] = true;
            distinctCount++;
        }
    }
    
    if (distinctCount % 2 == 1) {
        System.out.println("IGNORE HIM!");
    } else {
        System.out.println("CHAT WITH HER!");
    }
}
