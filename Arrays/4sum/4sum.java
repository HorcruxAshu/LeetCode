class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //Brute force: Sort the array first keep 3 pointers and do Binary Search over right of third pointer to find target - (sum of 3 pts), if found keep (i,j,k,target-sum) it and move the pointer to the rightwards. Keep a set to add all the unique quads to it, then append the set elements to the arrayList. 
        
        
        //Optimal: Sort the array first keep 2 pointers (i, j) and do two sum with two pts (left, right) on the right of the two pts. Skip duplicates. 
        
        
        List<List<Integer>> solution = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return solution;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int left = j+1;
                int right = nums.length - 1;
                int sumSoFar = nums[i] + nums[j];
                int remainingSum = target - sumSoFar;
                while(left < right){
                    int twoSum = nums[left] + nums[right];
                    if(twoSum == remainingSum){
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        solution.add(list);
                        
                        //duplicates for left pt.
                        while(left < right && nums[left] == list.get(2))++left;
                        
                        //duplicates for right pt.
                        while(left < right && nums[right] == list.get(3))--right;
                        
                    }else if(twoSum > remainingSum){
                        right--;
                    }else{
                        left++;
                    } 
                }
                //duplicates for j.
                while(j + 1 < nums.length && nums[j] == nums[j + 1])++j;
                
            }
            //duplicates for i.
                while(i + 1 < nums.length && nums[i] == nums[i + 1])++i;
        }
        
        return solution; 

    }
}