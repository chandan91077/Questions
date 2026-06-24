class Solution {
    public List<List<Integer>> generate(int nums) {
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<nums;i++){
            int val=1;
            List<Integer>ans=new ArrayList<>();
            for(int j=0;j<=i;j++){
                ans.add((int)val);
                val=val*(i-j)/(j+1);
            }
            res.add(ans);
        }
        return res;
    }
}