class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=number(i);
        }
        return ans;
    }
    public int number(int n){
        int count=0;
     for(int i=0;i<32;i++){
        if((n&1)==1)
         count++;
        n>>=1;
     }  
     return count; 
    }
}
