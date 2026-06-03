class Solution {
    public String reverseWords(String s) {
        StringBuilder bs=new StringBuilder();
        String[] sb=s.trim().split("\\s+");
        for(int i=sb.length-1;i>=0;i--){
            bs.append(sb[i]);
            if(i!=0){
                bs.append(" ");
            }
        }
        return bs.toString();
    }
}