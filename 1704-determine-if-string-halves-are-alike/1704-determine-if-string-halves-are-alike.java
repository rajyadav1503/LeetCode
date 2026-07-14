class Solution {
    public boolean halvesAreAlike(String s) {

        int n = s.length();
        for(int i=0;i<n;i++){
            Character.toLowerCase(s.charAt(i));
        }    

        int count1=0;
        int count2=0;    
        for(int i=0;i<n/2;i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ){
                count1++;
            }
        }

        for(int i=n/2;i<n;i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if( ch=='a' || ch =='e'|| ch =='i'|| ch =='o'|| ch =='u' ){
                count2++;
            }
        }

        if(count1==count2) return true;

        return false;
    }
}