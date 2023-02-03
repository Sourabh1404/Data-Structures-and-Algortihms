class Solution {
    public int numSub(String s) {
       int sum=0;
       String[] ans=s.split("0");
       for(String i: ans){
           int len=i.length();
           int add=0;
           while(len>0){
               add+=len;
               add%=1000000007;
               len--;
           }
            sum+=add;
       } 
       return sum;
    }
}
