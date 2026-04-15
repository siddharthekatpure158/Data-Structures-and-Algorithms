class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
       HashMap<Character,Integer> map2=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    map.put(ch, map.getOrDefault(ch, 0) + 1);
}
        for (int i = 0; i < t.length(); i++) {
    char ch = t.charAt(i);
    map2.put(ch, map2.getOrDefault(ch, 0) + 1);
}

for(char ch:map2.keySet()){
    if(map.containsKey(ch) ){
        int afreq=map.get(ch);
        int bfreq=map2.get(ch);
        if(afreq!=bfreq) return false;
    }
    else{
        return false;
    }
}
return true;
    }
}