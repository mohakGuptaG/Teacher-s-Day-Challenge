import java.util.*;

public class Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr1 = new int[n];

        int sum = 0;
        
        for(int i=0; i<n;i++){
            arr1[i] = sc.nextInt();

            sum = sum + arr1[i];
        }

        int mysum = 0;
        int count = 0;

        Arrays.sort(arr1);

        for(int i = 0;i<n;i++){

            if(mysum>sum/2){
                break;
            }
            else{
                 mysum += arr1[n-1-i];
                count++;
            }
        }

        System.out.println(count);


    }
}
