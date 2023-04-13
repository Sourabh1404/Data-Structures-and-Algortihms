//Solution 1

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {   reverse(image[i]);
            invert(image[i]);
           
        }
        return image;
        
    }
    static void reverse(int[] image){
         int start=0,end=image.length-1;
            while(start<=end)
            {
                int temp=image[start];
                image[start]=image[end];
                image[end]=temp;
                start++;
                end--;
            }
       
    }
    static void invert(int[] image)
    {
         for(int j=0;j<image.length;j++)
        {
            if(image[j]==0)
                image[j]=1;
            else
                image[j]=0;
        }
    }
}


//Solution 2

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     for(int[] arr:image){
        for(int i=0;i<(image[0].length+1)/2;i++)
         {
             int temp=arr[i]^1;
             arr[i]=arr[image[0].length-i-1]^1;
             arr[image[0].length-i-1]=temp;
         }
     }
    return image;
        
    }
}
