class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
       HashSet<Integer> set = new HashSet<>();
        for(int num: map.keySet()){
            int freq = map.get(num);
            if(set.contains(freq)){
                return false;
            }
            set.add(freq);
        }
        return true;
    }
}