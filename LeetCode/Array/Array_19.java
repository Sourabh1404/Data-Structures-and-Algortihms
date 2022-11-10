//Solution1//

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


//Solution2//


class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] year= new int[101];
        for(int[] i:logs){
            year[i[0]-1950]++;
            year[i[1]-1950]--;
        }
        int max=year[0];
        int ans=1950;
        for(int i=1;i<year.length;i++){
            year[i]+=year[i-1];
            if(max<year[i]){
                max=year[i];
                ans=i+1950;
            }
        }
        return ans;
 }
}
