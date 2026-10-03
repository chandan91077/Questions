class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String>seen=new HashSet<>();
        List<String>res=new ArrayList<>();
        for(int i=0;i<=s.length()-10;i++){
            String seq=s.substring(i,i+10);
            if(seen.contains(seq)){
                if(!res.contains(seq)){
                    res.add(seq);
                }
            }else{
                seen.add(seq);
            }
        }
        return res;
    }
}