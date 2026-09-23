class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l = 0;
        int w = 0;
        int ans = Integer.MAX_VALUE;

        for(int r = 0; r<blocks.length(); r++){
            if(blocks.charAt(r) == 'W'){
                w++;
            }
            if(r - l + 1 == k){
              ans = Math.min(ans, w);
            
             if (blocks.charAt(l) == 'W') {
                    w--;
                }

                l++;
            }
        }
        return ans;
    }
}