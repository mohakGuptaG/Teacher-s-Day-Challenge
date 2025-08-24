import java.util.*;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();

        int count = 0;

        for(int i = 5; i>0 ;i-- ){
            while(d>=i){
                
                d = d-i;

                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
