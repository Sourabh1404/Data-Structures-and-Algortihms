class Solution {
    public int hammingDistance(int x, int y) {
      int count=0;
      while(x>0 || y>0){
          int a=x&1;
          int b=y&1;
          if((a^b)==1)
          count++;
          x=x>>1;
          y=y>>1;
      }  
      return count;
    }
}



class Solution {
    public int hammingDistance(int x, int y) {
      int n=x^y;
      int count=0;
      while(n>0){
          count++;
          n&=(n-1);
      }  
      return count;
    }
}
