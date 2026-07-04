class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        sort(nums,0,nums.length-1);
        sort(nums,0,k-1);
        sort(nums,k,nums.length-1);

    }
    public static void sort(int[]nums,int start,int end){
        while(start<=end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }
}