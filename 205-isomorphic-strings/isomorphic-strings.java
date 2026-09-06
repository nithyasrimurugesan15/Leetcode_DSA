class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> shm = new HashMap<>();
        HashMap<Character,Character> thm = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            shm.put(sch,tch);
        }
           for(int i=0;i<t.length();i++) {
            char sch = s.charAt(i);
            char tch = t.charAt(i);
            thm.put(tch,sch);
        }

        for(int i=0;i<s.length();i++) {
            if(shm.get(s.charAt(i))!=t.charAt(i)) {
                return false;
            }
            if(thm.get(t.charAt(i))!=s.charAt(i)) {
                return false;
            }
        }
     return true;
    }
}