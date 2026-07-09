class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean[] arr = new boolean[26];

        int n = sentence.length();

        for(int i=0;i<n;i++){
            arr[sentence.charAt(i)-'a'] = true;
        }

        for(boolean b : arr){
            if(b==false) return false;
        }

        return true;
    }
}