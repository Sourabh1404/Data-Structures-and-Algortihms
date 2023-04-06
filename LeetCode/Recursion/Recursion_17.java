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


//Solution 3

class Solution {
    public boolean isPowerOfTwo(int n) {
    int count=0;
    while(n>0){
    int last=n&1;
    if(last==1)
    count++;
    n=n>>1;

    }
    return (count==1);

    }
}
