class Solution {
    public String decodeMessage(String key, String message) {

        int n = key.length();
        char[] arr = new char[256];
        char start = 'a';
        for(int i=0;i<n;i++){
            char ch = key.charAt(i);
            if(ch != ' '){
                if(arr[ch] == 0){
                    arr[ch] = start;
                    start++;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        int m = message.length();
        for(int i=0;i<m;i++){
            char ch = message.charAt(i);
            if(ch == ' '){
                ans.append(' ');
            }else{
                ans.append(arr[ch]);
            }
        }

        return ans.toString();
        
    }
}