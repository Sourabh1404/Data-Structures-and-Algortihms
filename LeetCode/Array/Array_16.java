class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
     for (int i:nums)
     {   int j=0;
         while(i!=0)
         {
             i/=10;
             j++;
         }
      if (j%2==0)
          count++;
     }
        return count;
    }
}
