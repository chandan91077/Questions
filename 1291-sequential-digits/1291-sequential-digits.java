class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer>ans= new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<=9;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            int num=q.poll();
            if(num>=low && num<=high){
                ans.add(num);
            }
            int lastdigit=num%10;
            
            if(lastdigit<9){
                int nextnum=num*10+lastdigit+1;
                if(nextnum<=high){
                    q.add(nextnum);
                }
            }
        }
        return ans;
    }
}