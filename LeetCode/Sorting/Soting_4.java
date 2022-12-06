//Solution1//

class Solution {
    public int missingNumber(int[] nums) {
     int i=0;
     int n=nums.length;
     while(i<n){
         int correct=nums[i];
         if(nums[i]<n && nums[i]!=nums[correct])
         swap(nums,i,correct);
         else
         i++;
     } 
    for(int j=0;j<n;j++){
        if(nums[j]!=j)
        return j;
    }
    return n;
    }
    public void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;    }
}

//Solution2//

class Solution {
    public int missingNumber(int[] nums) {
     int n=nums.length;
     int sum=0;
     for(int i:nums)
     sum+=i;

     return n*(n+1)/2 - sum;   
    }
}
