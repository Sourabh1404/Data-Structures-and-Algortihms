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
