class Solution {
    public int search(int[] nums, int target) {
       return ans(nums, target,0, nums.length-1 );
    }
    public int ans(int[] nums, int target,int s, int e){
        if(s>e)
        return -1;
        int mid=s+(e-s)/2;
        if(nums[mid]==target)
        return mid;

        if(nums[mid]<target)
        return ans(nums, target,mid+1, e);

        return ans(nums, target,s, mid-1);
    }
}
