class Solution {
    public static char getMaxOccuringChar(String s) {
        // code here
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            char currchar=s.charAt(i);
            freq[currchar-'a']++;
        }
        int max=-1;
        char ans='a';
        for(int i=0;i<26;i++){
            if(freq[i]>max){
                max=freq[i];
                ans=(char)(i+'a');
            }
        }
        return ans;
    }
}