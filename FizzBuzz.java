class Solution {
    public List<String> fizzBuzz(int n) {
        String[] arr1 = new String[n];
        
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                arr1[i-1] = "FizzBuzz";
            }
            else if(i % 3 == 0){
                arr1[i-1] = "Fizz";
            }
            else if(i % 5 == 0){
                arr1[i-1] = "Buzz";
            }
            else {
                arr1[i-1] = String.valueOf(i);
            }
        }
        
        return Arrays.asList(arr1);
    }
}
