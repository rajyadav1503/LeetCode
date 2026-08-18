class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(s.charAt(i) + 32);
            }
            sb.append(ch);
        }

        return new String(sb);
    }
}