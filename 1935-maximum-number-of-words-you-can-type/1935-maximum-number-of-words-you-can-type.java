class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[]words=text.split(" ");
        int count=0;
        for(String w:words){
            boolean type=true;
            for(char c : brokenLetters.toCharArray()){
                if(w.indexOf(c)!=-1){
                    type=false;
                    break;
                }
            }
            if(type)count++;

        }
        return count;
    }
}