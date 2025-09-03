import java.util.*;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = {4,7,44,47,74,77,444,447,477,744,747,774,777};

        for(int i=0; i<arr.length; i++){
            if(n%arr[i]==0){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
