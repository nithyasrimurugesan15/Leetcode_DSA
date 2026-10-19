class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int mov = 0;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<=nums[i-1]) {
                  int nv = nums[i-1]+1;
                  mov+=nv-nums[i];
                  nums[i]=nv;

            }
        }
        return mov;
    }
}