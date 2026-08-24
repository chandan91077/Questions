class Solution {
    public int largestRectangleArea(int[] heights) {
        int area=0;
        int n=heights.length;
        if(n==0){
            return 0;
        }
        int[]left=new int[n];
        int[]right=new int[n];
        left[0]=-1;
        for(int i=1;i<n;i++){
            int prev=i-1;
            while(prev>=0 && prev>=heights[i]){
                prev=left[prev];
            }
            left[i]=prev;
        }
        for(int i=n-2;i>=0;i--){
            int prev=i+1;
            while(prev<n && prev<=heights[i]){
                prev=right[prev];
            }
            right[i]=prev;
        }
        for(int i=0;i<n;i++){
            int w=right[i]-left[i]-1;
            area=Math.max(area,w*heights[i]);
        }
        return area;

    }
}