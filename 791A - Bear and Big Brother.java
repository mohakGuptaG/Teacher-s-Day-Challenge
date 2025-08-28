import java.util.*;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = 0;

        while(a<=b){
            i++;
            a = a*3;
            b = b*2;
        }

        System.out.println(i);
    }
}
