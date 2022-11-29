class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
      int[] ans=new int[2];
      int sumA=0;
      int sumB=0;
       for(int i:aliceSizes)
       sumA+=i;
       for(int i:bobSizes)
       sumB+=i;
       int dif=(sumA-sumB)/2;
       if(dif>0)
      { binsearch(aliceSizes, bobSizes, ans, dif);
        int temp=ans[0];
        ans[0]=ans[1];
        ans[1]=temp;
        }
       else{
           dif*=(-1);
            binsearch(bobSizes, aliceSizes, ans, dif);
        }
        
      return ans;
      
    }
    public int[] binsearch(int[] arr1,int[] arr2, int[] ans, int dif){
        Arrays.sort(arr1);
        for(int i:arr2){
          int start=0;
          int end= arr1.length-1;
          while(start<=end){
              int mid=(start+end)/2;
              if(arr1[mid]== i+dif)
              {ans[0]=i;
              ans[1]=arr1[mid];
              return ans;}
              else if (arr1[mid]>i+dif)
              end=mid-1;
              else
              start=mid+1;
          }
      } 
      return ans; 

    }
}
