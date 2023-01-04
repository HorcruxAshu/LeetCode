public class Solution {
    public int solve(int[] A, int B) {
        //Optimal: Use prefix xor to store xor, if say Y = prefixXor ^ B, then the number of times Y occurs will be the count of the subarrays. 
        
        
        int xOR = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for(int i = 0; i < A.length; i++){
            xOR ^= A[i];
            if(xOR == B){
                count++;
            }
            int y = xOR ^ B;
            if(map.containsKey(y)){
                count += map.get(y);
            }
            if(map.containsKey(xOR)){
                map.put(xOR, map.get(xOR) + 1);
            }else{
                map.put(xOR, 1);
            }
            
        }
        return count;
    }
}
