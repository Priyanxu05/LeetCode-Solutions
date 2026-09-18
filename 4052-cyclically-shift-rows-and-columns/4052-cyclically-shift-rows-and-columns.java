class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
         int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            int x=rowShift[i];
        for (int j=0;j<n;j++) {
            arr[i][(j-x+n)%n]=grid[i][j];
            }}
        int[][] arr2=new int[n][n];
        for (int j=0;j<n;j++){
            int x=colShift[j];
        for(int i=0;i<n;i++) {
            arr2[(i-x+n)%n][j]=arr[i][j]; } }

        return arr2;
    }
}