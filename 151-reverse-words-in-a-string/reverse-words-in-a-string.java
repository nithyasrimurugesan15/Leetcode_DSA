class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int j= s.length()-1;
        int i=j;
        
        while(j>=0 && i>=0) 
        {
            while(j>=0 && s.charAt(j)==' ') {
                j--;
            }

           i=j;
            while(i>=0 && s.charAt(i)!= ' ') {
                i--;
            }
            
            res.append(s.substring(i+1,j+1)).append(" ");
            j=i-1;
           
        }
        return res.toString().trim();
    }
}