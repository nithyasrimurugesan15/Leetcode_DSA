class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        int cnt=0;
        while(j<nums.length) {
           if(nums[j]==0) {
            cnt++;
           }
           while(cnt>k) {
              if(nums[i]==0) {
                cnt--;
              }
              i++;
           }
           max=Math.max(max,j-i+1);
           j++;
        }
        return max;
    }
}