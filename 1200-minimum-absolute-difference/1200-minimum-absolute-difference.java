class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(arr);
        int mind=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            mind=Math.min(mind,arr[i]-arr[i-1]);
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==mind){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;
    }
}