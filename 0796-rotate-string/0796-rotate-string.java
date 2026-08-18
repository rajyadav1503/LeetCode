class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
        if(s.length() != goal.length()) return false;
        
        int n = goal.length();
        for(int i=0;i<n ; i++){
            String temp = "";
            for(int j=1 ; j<n;j++){
                temp += s.charAt(j);
            }
            temp += s.charAt(0);

            if(temp.equals(goal)){
                return true;
            }

            s=temp;
        }

        return false;
    }
}