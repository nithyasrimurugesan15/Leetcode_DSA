class Solution {
    public int myAtoi(String s) {
        s=s.trim();
          if(s.isEmpty())
        {
            return 0;
        }
        int sign=1;
        int i = 0;

      if(s.charAt(i) == '-' || s.charAt(i) == '+') {
      sign = (s.charAt(i) == '-') ? -1 : 1;
       i++;
      }
        return helper(s,sign,i,0);
    }
    public int helper(String s,int sign,int i,int num) {
        if(i>=s.length() || !Character.isDigit(s.charAt(i))) {
            return num*sign;
        }
        int digit = s.charAt(i)-'0';
        if(num> (Integer.MAX_VALUE-digit)/10) {
            return sign==1 ? (Integer.MAX_VALUE) : (Integer.MIN_VALUE);
        }
        num=num*10+digit;
        return helper(s,sign,i+1,num);

    }
}