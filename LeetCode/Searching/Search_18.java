class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        result[0]=search(nums,target,0);
        if(result[0]!=-1)
        result[1]=search(nums,target,1);
        return result;
    }
    public int search(int[]nums,int target,int find){ 
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>target)
            end=mid-1;
            else if(nums[mid]<target)
            start=mid+1;
            else
            {
                ans=mid;
            if(find==0)
                end=mid-1;
            else
            start=mid+1;
        }
    }
    return ans;
    }
    
}
