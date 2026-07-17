class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if(numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int jump = (numRows - 1) * 2 ;
        for(int i=0 ; i<numRows ; i++){
            if(i!=0 && i!=numRows-1){
                for(int j = i; j < n; j += jump){
                    sb.append(s.charAt(j));
                    int diag = j + jump - 2 * i;
                    if(diag < n){
                        sb.append(s.charAt(diag));
                    }
                }
            }  
            else{
                for(int j = i ; j < s.length() ; j = j + jump ){
                    sb.append(s.charAt(j));
                } 
            }
        }
        return new String(sb);
    }
}