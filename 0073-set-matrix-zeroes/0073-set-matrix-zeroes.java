class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++ ){
                if(matrix[i][j] == 0) {
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for(int i=0;i<row.size();i++){
            for(int j = 0;j<matrix[0].length;j++){
                matrix[row.get(i)][j] = 0;
            }
        }
        for(int j=0;j<column.size();j++){
            for(int i = 0 ; i<matrix.length;i++ ){
                matrix[i][column.get(j)] = 0;
            }
        }
        return;
    }
}