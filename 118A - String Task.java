import java.util.*;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String str1 = str.toLowerCase();

        String str2 = str1.replaceAll("[a,o,y,e,u,i]","");

        String str3 = str2.replaceAll("",".");

        String str4 = str3.substring(0, str3.length()-1);

        System.out.println(str4);

    }
}
