class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
      HashSet<Integer> set = new HashSet<>();

      if (nums.length == 0) return 0;

        for(int i : nums){
            set.add(i);
        }

        for(int i: set){
            if(!set.contains(i-1)){
                int current = i;
                int length = 1;
            
            while(current != Integer.MAX_VALUE && set.contains(current + 1)){
                current++;
                length++;
            }
             ans = Math.max(ans, length);
            }
            
        }
       
        return ans;
    }
}