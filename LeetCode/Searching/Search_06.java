class Solution {
    public int arrangeCoins(int n) {
     long sum=0;
     for(int i=1;i<=n;i++){
        sum+=i;
        if(sum>n)
            return i-1;
     } 
     return 1;  
    }
}
