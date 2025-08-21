import java.util.*;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();

        int n = sc.nextInt();

        int area = m*n;

        int piece = area/2;

        System.out.println(piece);
    }
}
