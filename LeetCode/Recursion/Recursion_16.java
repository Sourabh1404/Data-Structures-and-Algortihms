class Solution {
    public boolean isPowerOfTwo(int n) {
  long m=1;
  while(m<n)
  m=m*2;

  return m==n;
    }
}
