class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
    ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i<matrix.length; i++){
            int min = Integer.MAX_VALUE;
            int minCol = -1;
            for(int j = 0; j<matrix[0].length; j++){
               if(matrix[i][j]<min){
                min = matrix[i][j];
                minCol = j;
               }
            }
            
           boolean lucky = true;
           for(int k = 0; k < matrix.length; k++){
              if(matrix[k][minCol] > min)
              lucky = false;
           }
            
        if(lucky){
            list.add(min);
        }}
        return list;
    }
}