class Solution {
    public boolean validPalindrome(String s) {

        int n = s.length();
        int left = 0;
        int right = n-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return ( palindrome(s , left + 1 , right ) || palindrome( s , left , right - 1) );
            }

            left++;
            right--;
        }

        return true;
        
    }

    public static boolean palindrome ( String s , int left , int right ) {
    
        while(left < right) {

            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }

        }
        return true;
    }
}