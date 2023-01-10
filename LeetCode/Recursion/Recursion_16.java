//Solution1//

class Solution {
    public boolean isPowerOfTwo(int n) {
  long m=1;
  while(m<n)
  m=m*2;

  return m==n;
    }
}

//Solution2//

class Solution {
    public boolean isPowerOfTwo(int n) {
   if (n<1)
      return false;
    if(n%2==0)
      return isPowerOfTwo(n/2);

      return n==1; 
    }
}
