class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        char[] ans = new char[n];
        for(int i=0;i<n;i++){
            int j = indices[i];
            ans[j] = s.charAt(i);
        }
        return new String(ans);
    }
}