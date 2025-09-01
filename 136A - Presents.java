import java.util.*;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int[] arr1 = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int a = 0, b = 0;

        for(int i=0; i<n; i++){
            a = i;

            b = arr[i];

            arr1[b-1] = a+1;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr1[i]+" ");
        }
        
        
    }
}
