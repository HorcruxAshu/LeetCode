//Approach is to set two counters (a, b) where if a same character is found increment a, else b.
//Intuition is to keep a track a of distinct characters while travelling over the string

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int b = 0;
        int a = 0;
        while(b < s.length()){
            if(!(set.contains(s.charAt(b)))){
                set.add(s.charAt(b));
                maxLen = Math.max(maxLen, set.size());
                b++;
            }else{
                set.remove(s.charAt(a));
                a++;
            }
        }
        return maxLen;
    }
}