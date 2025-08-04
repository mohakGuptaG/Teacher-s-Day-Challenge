import java.util.*;

public class WayTooLongWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n>0){
            String str = sc.next();
            int l = str.length();
            if (l>10){
                System.out.println(""+str.charAt(0)+(l-2)+str.charAt(l-1));
              //NOTE: here in this part adding "" a string before all the elements are imp
              //because while performing sout it considers the datatype from left to right
              //therefore if do not add the string before it will consider all the elements 
              //integers and return integer values which are concatenated. Therefore it's imp to add a string before the statement to print the char values.
            }

            else{
                System.out.println(str);
            }
            n--;
        }
    }
}
