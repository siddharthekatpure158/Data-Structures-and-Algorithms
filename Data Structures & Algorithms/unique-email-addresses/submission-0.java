class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet();
        for(int i=0;i<emails.length;i++){
                StringBuilder sb=new StringBuilder();
                boolean skipdots=true;
                boolean symbol=true;
                boolean attherate=false;
            for(int j=0;j<emails[i].length();j++){
                
                if(emails[i].charAt(j)=='@') {
                    skipdots=false;
                    attherate=true;
                }
                if(emails[i].charAt(j)=='@') symbol=true;
                if(emails[i].charAt(j)=='+' && !attherate) symbol=false;

                if((emails[i].charAt(j)!='.' || !skipdots) && symbol){
                    sb.append(emails[i].charAt(j));
                }

            }
            set.add(sb.toString());
        }
        return set.size();
    }
}