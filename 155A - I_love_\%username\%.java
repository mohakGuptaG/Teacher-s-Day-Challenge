import java.util.*;

public class LoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int min = 0;
        int count = 0;

        for(int i=0; i<n; i++){

            if(i==0){
                min = arr[i];
                max = arr[i];
            }

            if(i!=0){
            
            if(arr[i]<min){
                count++;
            }

            if(arr[i]>max){
                count++;
            }

            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            }


        }

        System.out.println(count);

        sc.close();
    }
}
