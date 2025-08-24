//my approach


import java.util.*;

public class Football{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int count = 0;

        int maxc = 0;

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
                if(count>maxc){
                    maxc = count;
                }

                if(maxc>6){
                    break;
                }
            }
            else{
                count = 0;
            }



        }

        int ret = maxc + 1;

        if(ret>6){
            System.out.println("YES");
        }

        else{
            System.out.println("NO");
        }
    }
}




//most optimal approach

import java.util.*;

public class Foot{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(str.contains("0000000") || str.contains("1111111") ? "YES":"NO");

        sc.close();
    }
}
