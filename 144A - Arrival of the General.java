import java.util.*;
 
public class ArrivalOfGeneral{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] arr = new int[n];
 
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
 
        int maxHeight=arr[0], maxIndex=0;
        int minHeight=arr[0], minIndex=0;
 
        for(int i=0; i<n; i++){
            if(arr[i]>maxHeight){
                maxHeight=arr[i];
                maxIndex=i;
            }
 
            if(arr[i]<=minHeight){
                minHeight=arr[i];
                minIndex=i;
            }
        }
 
        int swap = maxIndex + (n-1-minIndex);
 
        if(maxIndex>minIndex){
            swap--;
        }
 
        System.out.println(swap);
    }
}
