class Solution {
    public boolean isPalin(String res) {
        int i=0;
        int j=res.length()-1;
        while(i<j) {
            if(res.charAt(i)!=res.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++) {
            for(int j=i;j<s.length();j++) {
                String res = s.substring(i,j+1);
                if(isPalin(res)) {
                    cnt+=1;
                }
            }
        }
        return cnt;
    }
}