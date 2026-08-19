class Solution {
    public boolean detectCapitalUse(String word) {
        String s1 = word.toUpperCase();
        String s2 = word.toLowerCase();
        String s3 = "";
        s3 += s1.charAt(0);
        for(int i=1;i<s2.length();i++){
            s3 += s2.charAt(i);
        }

        if(word.equals(s1) || word.equals(s2) || word.equals(s3)){
            return true;
        }

        return false;
        
    }
}