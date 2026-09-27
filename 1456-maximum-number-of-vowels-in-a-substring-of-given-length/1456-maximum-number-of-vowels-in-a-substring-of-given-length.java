class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }

        }
        max = count;

        for(int i = k; i<s.length(); i++){
           char ch = s.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
           }
           char rem = s.charAt(i-k);
           if(rem == 'a' || rem == 'e' || rem == 'i' || rem == 'o' || rem == 'u'){
            count--;
           }
           max = Math.max(max, count);
        }


        return max;
    }
}