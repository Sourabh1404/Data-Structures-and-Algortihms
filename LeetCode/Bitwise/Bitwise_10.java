class Solution {
    public boolean hasAlternatingBits(int n) {
     while(n>1){
         int a=n&1;
         n>>=1;
         if(a==(n&1))
         return false;
     }   
     return true;
    }
}
