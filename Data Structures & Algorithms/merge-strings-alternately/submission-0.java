class Solution {
    public String mergeAlternately(String word1, String word2) {

        int i=0;
        int j=0;
        StringBuilder st=new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            st.append(word1.charAt(i++));
            st.append(word2.charAt(j++));
        }
        while(i<word1.length()){
            st.append(word1.charAt(i++));
        }
        while(j<word2.length()){
            st.append(word2.charAt(j++));
        }

        return st.toString();
    }
}