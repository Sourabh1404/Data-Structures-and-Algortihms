// Binary Search//

class Solution {
    public boolean checkIfExist(int[] arr) {
       Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
         int start=0;
         int end=arr.length-1;
         while(start<=end){
             int mid=(start+end)/2;
             if(arr[mid]==2*arr[i] && i!=mid)
             {  System.out.println(mid);
                 return true;}
             else if(arr[mid]<2*arr[i])
             start=mid+1;
             else 
             end=mid-1;
         }
     }
     
       return false;
    }
}

//Linear Search//

class Solution {
    public boolean checkIfExist(int[] arr) {
    
     for(int i=0;i<arr.length;i++){
     
        for (int j=0;j<arr.length;j++){
            if(i!=j && arr[j]==2*arr[i])
            return true;
        }
     }
     
       return false;
    }
}
