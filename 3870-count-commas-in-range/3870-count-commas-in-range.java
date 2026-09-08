class Solution {
    public int countCommas(int n) {
        int sum = 1;

        if(n<1000){
            return 0;
        }

       for(int i = 1000; i<n; i++){
        sum++;

       }
       return sum;
    }
}