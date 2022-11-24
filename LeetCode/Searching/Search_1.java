
class Solution {
    public int mySqrt(int x) {
    long start=0;
    long end=x;  
    long ans=0;
    while(start<=end){
    long mid=(start+end)/2;
        if(mid*mid>x)
            end=mid-1;
        else if (mid*mid<x)
            {start=mid+1;
            ans=mid;}
        else 
        return (int)mid;    
    }
    return (int)ans;
    } 
}
