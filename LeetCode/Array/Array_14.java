class Solution {
    public int oddCells(int m, int n, int[][] indices) {
     int[][] ans=new int[m][n];
     for(int i=0;i<indices.length;i++){
            int j=0;
            for(int k=0;k<n;k++){
                ans[indices[i][j]][k]++;
                }
             j++;
            for(int k=0;k<m;k++){
                ans[k][indices[i][j]]++;
                }
     }   
     
            int count=0;
            for(int[] i:ans){
                for(int j:i){
                    if(j%2!=0)
                    count++;
                }
            }
            return count;
    }
}
