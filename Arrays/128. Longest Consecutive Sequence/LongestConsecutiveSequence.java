class Solution {
    public int longestConsecutive(int[] nums) {
        //Brute force: Sort the array and count consecutive numbers by skipping the duplicates. SC: O(1) TC: O(nlogn) + O(n)
        
        //Optimal: To use HashSet to store all numbers and then linearly iterate over the arr to check if num - 1 exits if it doesn't we start iterating towards num + 1 to check if that lies in the HashSet alongside we also keep a track of longestConsecutive;
        //SC: O(n)
        //TC: O(3n)
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longestStreak = 0;
        for(int num : nums){
            if(!(set.contains(num - 1))){
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
            
        }
        return longestStreak;
    }
}