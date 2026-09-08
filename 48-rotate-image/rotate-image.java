class Solution {
    public void rotate(int[][] m) {
        int r=m.length;
        int c=m[0].length;
        int[][] rot = new int[r][c];

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                rot[j][r-i-1] =m[i][j];
            }
        }
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                m[i][j] =rot[i][j];
            }
        }
    }
}