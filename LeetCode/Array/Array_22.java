//Solution1
class Solution {
    public int[] sumZero(int n) {
    int[] ans=new int[n];
        for(int i=(int)(ans.length/2);i>=(int)(-ans.length/2);i--)
            {   
                if(i==0)
                 if(ans.length%2==0)
                    continue;
            ans[--n]=i;
                    }
        return ans;
    }
}



//Solution2
class Solution {
    public int[] sumZero(int n) {
    int[] ans=new int[n];
        int start=0;
        int end=n-1;
        while(start<end)
        {
            ans[start]=start+1;
            ans[end]=ans[start]*(-1);
            start++;
            end--;
            
        }
        return ans;
    }
}
