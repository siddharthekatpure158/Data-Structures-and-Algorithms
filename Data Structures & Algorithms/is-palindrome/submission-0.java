class Solution {

    public boolean valid(char ch) {
    if ((ch >= 'a' && ch <= 'z') ||
        (ch >= 'A' && ch <= 'Z') ||
        (ch >= '0' && ch <= '9')) {
        return true;
    }
    return false;
}

    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        
        
        while (i < j) {

            if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }

            if(!(valid(s.charAt(i)))){
                i++;
                continue;
            }
            if(!(valid(s.charAt(j)))){
                j--;
                continue;
            }

            else if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            
    
        }

        return true;
    }
}