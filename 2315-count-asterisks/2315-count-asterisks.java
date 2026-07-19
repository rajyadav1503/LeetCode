class Solution {
    public int countAsterisks(String s) {
        int n = s.length();
        int countBar = 0;
        int countStar = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='|'){
                countBar++;
            }
            if(countBar % 2 == 0 && s.charAt(i)=='*'){
                countStar++;
            }
        }
        return countStar;
    }
}