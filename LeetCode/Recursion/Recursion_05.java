class Solution {
    public void reverseString(char[] s) {
           solve(s, 0, s.length-1);  
    }
    
    public void solve(char[] s, int start, int end){
        if(start>=end)
        return; 
       
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        solve(s,++start,--end);
    }
}
