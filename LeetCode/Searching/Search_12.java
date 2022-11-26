class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    ArrayList<Integer> ans=new ArrayList<Integer>();
    int[] arr=new int[1001];
    for(int i=0;i<nums1.length;i++){
        arr[nums1[i]]=1;
        }
    for(int i=0;i<nums2.length;i++)
    { if(arr[nums2[i]]==1){
        arr[nums2[i]]=0;
        ans.add(nums2[i]);
        }
         }
    int[] ret= new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            ret[i]=ans.get(i); }    
   return ret;
    }
}
