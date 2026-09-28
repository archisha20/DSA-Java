class Solution {
    public int countGoodSubstrings(String s) {
        int freq[] = new int[26];
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;

            if(i >= 3){
                freq[s.charAt(i-3) - 'a']--;
            }

            if(i>=2){
                boolean diff = true;

                for(int j = 0; j < 26; j++){
                   if(freq[j] > 1){
                    diff = false;
                    break;
                   }
                }
                if(diff == true){
                    count++;
                }
            }
        }
       
        return count;
    }
}