class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        int nums2[] = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            if(nums1[i]%2 == 1){
                minOdd = Math.min(minOdd, nums1[i]);
            }
        }

        
        

        for(int i = 0; i<nums1.length; i++){
            if(nums1[i]%2 == 0 && minOdd != Integer.MAX_VALUE){
                if(nums1[i]<minOdd){
                    return false;
                }
            }
        }
         return true;
    }
}