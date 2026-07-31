class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        int[] broken = new int [26];
        for(char ch : brokenLetters.toCharArray()) {

            broken [ch - 'a']++;
        }
        String[] words = text.split(" ");
        int count = 0;
        for(String word: words){
        int i;
        for ( i = 0 ; i < word.length(); i++){
            if (broken [word.charAt(i) -'a'] > 0) {
                break;
            }
        }
        if(i== word.length()) {
            count++;
        }
    }

    return count;

    }
}