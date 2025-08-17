import java.util.*;

public class HelpfulMaths{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String str = sc.next();
       String sum = "\\+"; //better to write it like "[+]"
       
       String[] string = str.split(sum);

       int[] numbers = new int[string.length];

       for(int i=0; i<string.length;i++){
              numbers[i] = Integer.parseInt(string[i]);
       }

       Arrays.sort(numbers);

       for(int j=0;j<numbers.length;j++){
              System.out.print(numbers[j]);

              if(j<numbers.length-1){
                     System.out.print("+");
              }
       }
    }   
} 
