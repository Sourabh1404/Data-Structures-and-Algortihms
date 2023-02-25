class Solution {
    public int search(int[] nums, int target) {
    int pivot=-1;
    int start=0;
    int end=nums.length-1;
    while(start<=end){
      int mid=(start+end)/2;
      if(mid<end && nums[mid]>nums[mid+1])
      pivot=mid;
      if (mid>start && nums[mid]<nums[mid-1])
      pivot=mid-1; 
      if(nums[0]>nums[mid])
      end=mid-1;
      else
      start=mid+1;
    }
    if(pivot==-1)
    return binsearch(nums,0,nums.length-1,target);
    
    if(nums[pivot]==target)
    return pivot;
    if(nums[0]<=target)
        return binsearch(nums,0,pivot, target );
    return binsearch(nums, pivot+1, nums.length-1,target);
    }
    public int binsearch(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)
            return mid;
            else if (nums[mid]>target)
            end=mid-1;
            else
            start=mid+1;
        }
        return -1;
    }
}
