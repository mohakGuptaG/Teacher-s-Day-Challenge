import java.util.*;

public class PetyaStrings {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        String str3 = sc.next();
        String str4 = sc.next();

        String str1 = str3.toLowerCase();
        String str2 = str4.toLowerCase();

        int n = str1.length();

        for(int i=0; i<n;i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                if(str1.charAt(i)<str2.charAt(i)){
                    System.out.println("-1");
                }
                else if(str1.charAt(i)>str2.charAt(i)){
                    System.out.println("1");
                }
                else{}
            }
        }

        if(str1==str2){
            System.out.println("0");
        }
   }   
}
