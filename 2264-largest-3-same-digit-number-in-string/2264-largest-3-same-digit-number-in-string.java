class Solution {
    public String largestGoodInteger(String num) {
        String ans="";
        for(int i=0;i<num.length()-2;i++){
            char curr=num.charAt(i);
            if(curr==num.charAt(i+1) && curr==num.charAt(i+2)){
                String arr=""+curr+curr+curr;
                if(ans.compareTo(arr)<0){
                    ans=arr;
                }
            }
        }
        return ans;

    }
}