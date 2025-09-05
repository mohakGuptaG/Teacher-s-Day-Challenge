import java.util.*;
 
public class GeorgeAndAccomodation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = 2;
 
        int[][] mat = new int[n][m];
 
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
 
        int count = 0;
 
        for(int i=0; i<n; i++){
            for(int j=0; j<m-1; j++){
                if(mat[i][j+1]-mat[i][j]==2 || mat[i][j+1]-mat[i][j]>2){
                    count++;
                }
            }
        }
 
        System.out.println(count);
        sc.close();
    }
}
