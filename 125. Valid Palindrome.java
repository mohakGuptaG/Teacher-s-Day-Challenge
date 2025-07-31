class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");

        int i = 0;
        int j = s.length()-1;

         while(i<=j){
             if(s.charAt(i)!=s.charAt(j)){
                return false;
             }
            i++;
            j--;
        }

        return true;
    }
}


//The ^ without [] acts as an anchor to the beginning, only checking for the start of the pattern.
//The ^ inside [] still applies to the whole string, but it changes the meaning of the character class from "match these" to "match anything but these."
// acts as negation operator.

