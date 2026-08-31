class Solution {
   
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int len=0;
        int j=0;
        int[] freq = new int[256];

        for(int i=0;i<s.length();i++) {
            int asc = (int) s.charAt(i);
            freq[asc]++;

            while(freq[asc]>1) {
                 freq[(int) s.charAt(j)]--;
                 j++;
            }
            maxlen = Math.max(maxlen,i-j+1);
        }

        return maxlen;
    }
}