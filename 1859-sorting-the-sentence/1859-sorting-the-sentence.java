class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        int m = words.length;
        String[] ans = new String[m];
  
        for(int i=0;i<m ; i++){
            int n = words[i].length();
            ans[words[i].charAt(n-1)-'0' - 1] = words[i];
        }

        for(int i=0;i<m ; i++){
            if(i>0){
                sb.append(" ");
            }
            sb.append(ans[i]);
            if(sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
            }

        }

        return new String(sb);
        
    }
}