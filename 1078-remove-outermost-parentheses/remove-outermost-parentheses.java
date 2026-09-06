class Solution {
    public String removeOuterParentheses(String s) {
      int res =0;
      StringBuilder r = new StringBuilder();
      for(int i=0;i<s.length();i++) {
        if(s.charAt(i)=='(') {
            if(res>=1) {
                r.append(s.charAt(i));
            }
            res++;
        }
        else 
        {
            res--;
             if(res>=1) {
                r.append(s.charAt(i));
            }

        }
      }
      return r.toString();
    }
}