class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       ArrayList<Integer> list = new ArrayList<>();
      int min = nums[0];
      int max = nums[0];

for (int i = 1; i < nums.length; i++) {
    if (nums[i] < min) {
        min = nums[i];
    }

    if (nums[i] > max) {
        max = nums[i];
    }
}
       
       for(int i : nums){
        set.add(i);
       }
       for(int i = min+1; i<=max-1; i++){
        if(!set.contains(i)){
        list.add(i);
        }
       }

       return list; 
    }
}