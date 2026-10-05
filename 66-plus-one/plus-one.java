class Solution {
    public int[] plusOne(int[] d) {
        int l = d.length;
        int[] df = new int[l+1];
        for(int i=l-1; i>=0; i--) {
            if(d[i] <= 8) {
                d[i] = d[i]+1;
                return d;
            }
            else {
                d[i]=0;
            }
        }

        if(d[0]==0) {
            
            df[0]=1;
        }
        return df;
    }
}