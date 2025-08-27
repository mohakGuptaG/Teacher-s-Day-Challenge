import java.util.*;

public class PetyaAndCountryside {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int maxw = 0;

        for(int i=0; i<n; i++){
            h[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(h[j]<=h[j-1]){
                    count++;
                }
                else{
                    break;
                }
            }

            for(int j=i-1; j>=0; j--){
                if(h[j]<=h[j+1]){
                    count++;
                }
                else{
                    break;
                }
            }
            
            if(count>maxw){
                maxw = count;
            }
        }

        System.out.println(maxw);
    }    
}
