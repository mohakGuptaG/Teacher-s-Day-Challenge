import java.util.*;

public class QueueAtTheSchool{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        
        for (int time = 0; time < t; time++) {
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    
                    arr[i] = 'G';
                    arr[i + 1] = 'B';
                    i++;
                }
            }
        }
        
        System.out.println(new String(arr));
    }
}
