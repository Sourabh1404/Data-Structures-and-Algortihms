class Solution {
    public int[][] generateMatrix(int n) {
    int[][] ans=new int[n][n];
    int top=0,left=0, right=n-1, down=n-1;
    int dir=0;
    int j=1;
    while(top<=down && left<=right && j<=n*n){
        if(dir==0){
        for(int i=left;i<=right;i++){
            ans[top][i]=j++;
            }
            top++;
        }
        else if(dir==1){
        for(int i=top;i<=down;i++){
            ans[i][right]=j++;
        }
            right--;
        }
        else if(dir==2){
        for(int i=right;i>=left;i--){
            ans[down][i]=j++;
        }
            down--;
        }
         else{
        for(int i=down;i>=top;i--){
            ans[i][left]=j++;
        }
            left++;
        }
        dir=(dir+1)%4;
    }  
    return ans;  
    }
}
