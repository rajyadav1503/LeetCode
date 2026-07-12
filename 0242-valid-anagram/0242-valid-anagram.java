class Solution {
    public boolean isAnagram(String s, String t) {
        //  if (s.length() != t.length()) return false;

        // int[] freq = new int[26];
        // for (int i = 0; i < s.length(); i++) {
        //     freq[s.charAt(i) - 'a']++;
        //     freq[t.charAt(i) - 'a']--;
        // }

        // for (int count : freq) {
        //     if (count != 0) return false;
        // }

        // return true;

        int n = s.length();
        if (s.length() != t.length()) return false;
        char[] arr = new char[s.length()];
        char[] arr1 = new char[s.length()];



        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i);
        }

        Arrays.sort(arr);

         for(int i=0;i<n;i++){
            arr1[i]=t.charAt(i);
        }
        Arrays.sort(arr1);

         return Arrays.equals(arr,arr1);

           
    }
}