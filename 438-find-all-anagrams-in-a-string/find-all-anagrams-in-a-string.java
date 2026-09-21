class Solution {
    boolean isAnagram(String a, String b) {

    int[] freq = new int[26];

    for (char c : a.toCharArray()) {
        freq[c - 'a']++;
    }

    for (char c : b.toCharArray()) {
        freq[c - 'a']--;
    }

    for (int x : freq) {
        if (x != 0) {
            return false;
        }
    }

    return true;
}
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {

        for (int j = i; j < s.length(); j++) {

        int len = j - i + 1;

        if (len == p.length()) {

            String sub = s.substring(i, j + 1);

            if (isAnagram(sub, p)) {
                ans.add(i);
            }
        }
        else if(len>=p.length()) {
            break;
        }
    }
}
return ans;

    }
}