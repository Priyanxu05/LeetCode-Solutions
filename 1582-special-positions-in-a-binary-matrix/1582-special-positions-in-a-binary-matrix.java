class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        int[] rowc= new int[m];
        int[] colnc = new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    rowc[i]++;
                    colnc[j]++;
                }}}

                int ans=0;
                for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        if(mat[i][j]==1 && rowc[i]==1 && colnc[j]==1)
                            ans++;}}

                return ans;
    }
}