class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
     int m=mat.length;
     int n=mat[0].length;
       if(r*c!=m*n)
            return mat;
        
          int[][] ans=new int[r][c];
           int k=0;
           for(int i=0;i<m;i++)
           {
               for(int j=0;j<n;j++){
                   ans[k/c][k%c]=mat[i][j];
                   k++;
               }
           }
           return ans;

           
    }
}
