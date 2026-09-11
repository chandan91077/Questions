class Solution {
    public int thirdMax(int[] nums) {
        long f=Long.MIN_VALUE;
        long s=Long.MIN_VALUE;
        long T=Long.MIN_VALUE;
        for(long num:nums){
            if(num==f||num==s||num==T){
                continue;
            }
            if(num>f){
                T=s;
                s=f;
                f=num;
            }else if(num>s){
                T=s;
                s=num;
            }else if (num>T){
                T=num;
            }
        }
        return T==Long.MIN_VALUE ?(int)f:(int)T;
    }
}