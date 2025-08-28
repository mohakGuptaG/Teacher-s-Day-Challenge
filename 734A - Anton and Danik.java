import java.util.*;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int anton = 0;
        int danik = 0;

        String str = sc.next();

        for(int i=0; i<n ; i++){
            if(str.charAt(i)=='A'){
                anton++;
            }
            else{
                danik++;
            }
        }

        if(anton>danik){
            System.out.println("Anton");
        }
        else if(anton==danik){
            System.out.println("Friendship");
        }
        else{
            System.out.println("Danik");
        }
    }
}
