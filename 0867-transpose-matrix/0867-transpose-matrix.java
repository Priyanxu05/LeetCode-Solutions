class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] arr=new int[n][m];

        for(int i=0;i<m * n;i++){
            int row=i/n;
            int coln=i%n;
            arr[coln][row]=matrix[row][coln];
        }
        return arr;

    }
}