class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        Map<Character,Integer> cs = new HashMap<>();
        for(char c : s.toCharArray()){
                cs.put(c,cs.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){
            cs.put(c,cs.getOrDefault(c,0)-1);
            if(cs.get(c)<0)
                return false;
        }
        return true;

    }
}
