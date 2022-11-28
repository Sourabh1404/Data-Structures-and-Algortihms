class Solution {
    public int specialArray(int[] nums) {
    int start=0;
    int end=nums.length;
    while(start<=end){
         int count=0;
        int mid=(start+end)/2;
        for(int i :nums){
            if (i>=mid)
            count++;
        }
        if(count==mid)
        return count;
        else if(count>mid)
        start=mid+1;
        else
        end=mid-1;
            }
    return -1;
    }
}
