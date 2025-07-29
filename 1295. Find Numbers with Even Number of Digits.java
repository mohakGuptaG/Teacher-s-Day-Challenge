//My Approach

class Solution{
	public int findNumbers(int[] nums){
		int count = 0;

        for(int i: nums){
            if(String.valueOf(i).length()%2==0){
                count+=1;
            }
        }
        return count;
	}
}

//Best Approach

class Solution{
	public int findNumbers(int[] nums){
		
		int count = 0;
		
		for(int i: nums){
			if((i>9 && i<100) || (i>999 && i<10000) || (i==100000)){
				count++;
			}
		}
		return count;
	}
}
