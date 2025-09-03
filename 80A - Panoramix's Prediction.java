import java.util.*;

public class PanorimixPrediction{
    public static boolean isPrime(int num) {
        if (num<2) return false;
        if(num == 2) return true;
        if(num%2==0) return false;

        for(int i=3; i*i<=num; i+=2){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    public static int nextPrime(int n){
        int candidate = n+1;

        while(!isPrime(candidate)){
            candidate++;
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int nextPrimeAfterN = nextPrime(n);

        if(m==nextPrimeAfterN){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
