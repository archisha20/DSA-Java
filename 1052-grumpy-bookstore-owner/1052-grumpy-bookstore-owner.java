class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied = 0;
        for(int i = 0; i<grumpy.length; i++){
            if(grumpy[i] == 0){
                satisfied += customers[i];
            }
        }
        int max = Integer.MIN_VALUE;
        int extra = 0;

        for(int i = 0; i<grumpy.length; i++){
            if(grumpy[i] == 1){
                extra += customers[i];

            }
            if(i>=minutes && grumpy[i - minutes] == 1){
                extra -= customers[i-minutes];
            }
            max = Math.max(max, extra);
        }
        return satisfied + max;
    }
}