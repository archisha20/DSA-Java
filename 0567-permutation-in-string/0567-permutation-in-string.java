class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int k = s1.length();
        if(k>s2.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0; i<k; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
           map1.put(c1,map1.getOrDefault(c1,0)+1);
           map2.put(c2,map2.getOrDefault(c2,0)+1);
        }

           if(map1.equals(map2)){
            return true;
           }

          for(int i = k; i<s2.length(); i++){
            char ch1 = s2.charAt(i);
            char ch2 = s2.charAt(i-k);
            map2.put(ch1, map2.getOrDefault(ch1,0)+1);
            map2.put(ch2,map2.get(ch2)-1);

            if(map2.get(ch2) == 0){
                map2.remove(ch2);
            }

            if(map1.equals(map2)){
                return true;
            }
          } 
        return false;
    }
}