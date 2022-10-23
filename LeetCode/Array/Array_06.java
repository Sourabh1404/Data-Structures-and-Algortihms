class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        List<Boolean> result= new ArrayList<>();
        for (int i=0;i<candies.length;i++){
                if(max<candies[i]){
                    max=candies[i];
                }
        }
           
        for(int j=0;j<candies.length;j++){
             candies[j]+=extraCandies;
            if(candies[j]>=max)
                result.add(true);
            else
                result.add(false);
                
            
            
        }
        return result;
    }
       
}
