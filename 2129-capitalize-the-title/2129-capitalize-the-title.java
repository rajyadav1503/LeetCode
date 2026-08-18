class Solution {
    public String capitalizeTitle(String title) {
        String s = title.toLowerCase();
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i].length() > 2){
                String temp = "";
                temp += Character.toUpperCase(arr[i].charAt(0));

                for(int j=1;j<arr[i].length();j++){
                    temp += arr[i].charAt(j);
                }
                sb.append(temp);
                sb.append(" ");
            }else{
                sb.append(arr[i]);
                sb.append(" ");
            }

        }
        sb.deleteCharAt(sb.length() - 1);
        return new String(sb);

    }
}