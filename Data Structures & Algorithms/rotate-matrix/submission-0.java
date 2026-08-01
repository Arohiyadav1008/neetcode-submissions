class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int startCol=0,endCol=matrix[i].length-1;
            while(startCol<endCol){
                int temp=matrix[i][startCol];
                matrix[i][startCol]=matrix[i][endCol];
                matrix[i][endCol]=temp;
                startCol++;
                endCol--;
            }
        }
    }
}