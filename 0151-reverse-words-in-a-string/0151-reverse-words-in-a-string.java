class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n = arr.length;
        for(int i=n-1 ; i>=0 ;i--){
            if(i==0){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]);
                sb.append(" ");
            }
            
        }

        return new String(sb);

    }
}