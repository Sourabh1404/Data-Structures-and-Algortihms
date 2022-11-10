class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] ans=new int[2051];
        int year=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<logs.length;i++)
    {   for(int j=logs[i][0];j<logs[i][1];j++)
        ans[j]++;
        
    } 
 for(int k=1950;k<2051;k++){ 
     if(max<ans[k]){
            max=ans[k];
            year=k;
            
        } 
 }
return year;   }
}
