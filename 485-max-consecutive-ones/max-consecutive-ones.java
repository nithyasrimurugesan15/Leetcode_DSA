class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int maxcnt=0;
        int j=0;
        int i=0;
        while(j<nums.length) {
           while(nums[j]==0 && i<=j) {
             i++;
           }
           
            maxcnt=Math.max(maxcnt,j-i+1);
             j++;
        }
        return maxcnt;

    }
}