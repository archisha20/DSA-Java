class Solution {
    public int smallestNumber(int n, int t) {
      while(true){
        int prod = 1;
         int s = n;
       while(s>0){
        int x = s%10;
        prod *= x;
        s /= 10;
       } 
       if(prod % t == 0){
        return n;
        }
       n++;
      }
       
       }
    }
