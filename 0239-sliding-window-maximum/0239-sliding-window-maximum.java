class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] arr=new int[n-k+1];
        int index=0;
        Deque<Integer>db=new LinkedList<>();
        for(int i=0;i<n;i++){
            while(!db.isEmpty() && db.peekFirst()<=i-k){
                db.pollFirst();
            }
            while(!db.isEmpty() && nums[db.peekLast()]<nums[i]){
                db.pollLast();
            }
            db.offer(i);
            if(i>=k-1){
                arr[index++]=nums[db.peek()];
            }
        }
        return arr;
    }
}