class Solution {

    public static boolean isPalindrome(String s , int i , int j){
        int left = i;
        int right = j;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;
        
        int count = n;
        for(int i=0 ; i<n-1 ;i++){
            for(int j=i+1;j<n ;j++){
                if(isPalindrome(s , i , j)){
                    count++;
                }
            }
        }

        return count;
    }
}