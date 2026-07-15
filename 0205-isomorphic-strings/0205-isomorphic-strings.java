class Solution {

    public static String createMapping(String s){
        int n = s.length();

        char[] arr = new char[256];
        char start = 'a';

        //create mapping 
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(arr[ch] == 0){
                arr[ch]=start;
                start++;
            }
        }

        //build answer
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<n;i++){
            ans.append(arr[s.charAt(i)]);
        }

        return ans.toString();
    }


    public boolean isIsomorphic(String s, String t) {

       String str1 = createMapping(s);
       String str2 = createMapping(t);

       if(str1.equals(str2)){
        return true;
       }

       return false;
    }
}