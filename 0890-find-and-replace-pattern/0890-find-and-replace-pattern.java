class Solution {

    public static String createMapping (String s){
        int n = s.length();
        char start = 'a';
        char[] arr = new char[256];

        for(int i=0;i<n;i++){

            char ch = s.charAt(i);
            if(arr[ch] == 0){
                arr[ch] = start;
                start++;
            }
        }

        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            ans.append(arr[s.charAt(i)]);
        }
        return ans.toString();
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int m = words.length;

        String convertedPattern = createMapping(pattern);
        
        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<m;i++){
            if(createMapping(words[i]).equals(convertedPattern)){
                list.add(words[i]);
            }
        }
        return list;
    }
}