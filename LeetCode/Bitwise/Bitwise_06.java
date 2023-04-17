class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
    List<String> time=new ArrayList<String>();
    for(int h=0;h<12;h++){
        for(int m=0;m<60;m++){
            if(Integer.bitCount(h)+Integer.bitCount(m)==turnedOn){

                if(m<10)
                time.add(String.format("%d:0%d",h,m));
                else
                time.add(String.format("%d:%d",h,m));
            }
        }
    }
    return time;
    }
}
