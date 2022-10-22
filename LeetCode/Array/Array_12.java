class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans= new int[gain.length+1];
        int max=-99999999;
        for(int i=1;i<ans.length;i++){
            ans[i]=gain[i-1]+ans[i-1];
        }
        for(int i=0;i<ans.length;i++){
            max=Math.max(max,ans[i]);
        }
        return max;
    }
}
