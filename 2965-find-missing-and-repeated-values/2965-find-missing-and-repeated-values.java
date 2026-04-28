class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        Set<Integer>set=new HashSet<>();
        int sum=0;
        int repeated=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int val=grid[i][j];
                if(set.contains(val)){
                    repeated=val;
                }
                set.add(val);
                sum+=val;
            }
        }
        int n1=n*n*(n*n+1)/2;
        int ans=(int)(n1-sum+repeated);
        return new int[]{repeated,ans};
    }
}