//Solution1//

class Solution {
    public int countNegatives(int[][] grid) {
    int count=0;
     for(int i=0;i<grid.length;i++)
     {int n=grid[i].length;
    int start=0;
     int end=n-1;
     while(start<=end)
     {
        int mid=(start+end)/2;
        if(grid[i][mid]>=0)
        start=mid+1;
        else 
        end=mid-1;
     }   
     count+=n-start;
    }
    return count;
    }
}

//Solution2//

class Solution {
    public int countNegatives(int[][] grid) {
 int count=0;
 int i=grid.length-1;
 int j=0;
 while(i>=0 && j<grid[i].length)
    {
    if(grid[i][j]<0){
        count+=grid[i].length-j;
        i--;
    }
    else
        j++;
    }
    return count;
    }
}
