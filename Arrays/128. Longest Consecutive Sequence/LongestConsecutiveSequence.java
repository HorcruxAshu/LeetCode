class Solution {
    public int longestConsecutive(int[] nums) {
        //Brute force: Sort the array and count consecutive numbers by skipping the duplicates.
        Arrays.sort(nums);
        int maxLen = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if( (i + 1 < nums.length)  && (nums[i] == nums[i + 1]))continue;
            if((i + 1 < nums.length) && (nums[i + 1] == nums[i] + 1)){
                count++;
            }else{
                maxLen = Math.max(count + 1, maxLen);
                count = 0;
            }
        }
        return maxLen;
    }
}