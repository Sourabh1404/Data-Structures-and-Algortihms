class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
        int start=0;
        int end=a.size()-1;
        while(start<end){
            int temp= a.get(start);
            a.set(start,a.get(end));
            a.set(end,temp);
            start++;
            end--;
        }
        return a;
    }

}
