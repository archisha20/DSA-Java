class Solution {
    public int totalNumbers(int[] digits) {
       int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }
        int count = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 8; c += 2) {
                    int[] need = new int[10];

                    need[a]++;
                    need[b]++;
                    need[c]++;

                    boolean pos = true;
                    for (int i = 0; i < 10; i++) {
                        if (need[i] > freq[i]) {
                            pos= false;
                            break;
                        }
                    }
                    if (pos) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}