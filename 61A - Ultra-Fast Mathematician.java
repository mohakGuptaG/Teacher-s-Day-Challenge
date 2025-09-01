import java.util.*;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char[] arr = new char[str2.length()];

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)=='0'&& str2.charAt(i)=='1'){
                arr[i]='1';
            }

            else if(str1.charAt(i)=='1'&& str2.charAt(i)=='0'){
                arr[i]='1';
            }

            else{
                arr[i]='0';
            }
        }



        System.out.println(arr);
    }
}

//For direct application of XOR

//Scanner sc = new Scanner(System.in);
//String str1 = sc.next(), str2 = sc.next();

//for(int i = 0; i < str1.length(); i++) {
//    System.out.print((str1.charAt(i) - '0') ^ (str2.charAt(i) - '0'));
//}

