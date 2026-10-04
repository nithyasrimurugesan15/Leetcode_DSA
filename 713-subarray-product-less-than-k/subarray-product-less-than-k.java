class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int prd=1;
        int cnt=0;
          while(j<nums.length) {
            prd*=nums[j];
            while(prd>=k && i<nums.length) {
                prd/=nums[i];
                i++;
            }
            if(prd<k && prd>0)
             cnt+=(j-i+1);
            j++;
          }
          return cnt;
    }
}