import java.util.*;

public class NextRound {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       int k = sc.nextInt();
       int count = 0;

       int[] arr1 = new int [n];

       for(int i=0;i<n;i++){
        arr1[i] = sc.nextInt();
       }

       for(int j = 0; j<arr1.length;j++){
        if(arr1[j]>=arr1[k-1] && arr1[j]!=0){
                count++;
        }
       }

       System.out.println(count);
    }
}

