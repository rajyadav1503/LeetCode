class Solution {
    public String[] findWords(String[] words) {

        ArrayList<String> list = new ArrayList<>();
        int n = words.length;
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        for(int i = 0; i<n ;i++){
            int count1 = 0;
            int count2=0;
            int count3=0;
            int len = words[i].length();
            for(int j=0;j<len;j++){
                if(row1.indexOf(words[i].charAt(j)) != -1 ){
                    count1++;
                }
                if(row2.indexOf(words[i].charAt(j)) != -1 ){
                    count2++;
                }
                if(row3.indexOf(words[i].charAt(j)) != -1 ){
                    count3++;
                }

                if(count1 == len || count2 == len || count3 == len){
                    list.add(words[i]);
                }
            }
        }

        return list.toArray(new String[0]);
    }
}