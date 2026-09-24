class Solution {
    public int smallestIndex(int[] nums) {
        int equalSum = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            int x = 0;
            if(sumDigits(nums[i]) == i){
                return i; 
            }
           
        }
        return -1;
    }
    static int sumDigits(int num){
        int sum = 0;
        while(num>0){
            int x = num%10;
            sum += x;
            num = num/10;
        }
        return sum;
    }
}