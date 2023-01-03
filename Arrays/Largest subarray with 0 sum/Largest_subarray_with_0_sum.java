//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        //Brute Force: O(N^2) two loop checking if the sum is 0, then calculating the sum of the subarray
        //the maxLen
        
        
        //Optimal: Keep a prefixSum, and HashMap where you keep arr[i], i as k,v. If the current prefixSum exists in the HashMap then that means if A + B = C  and A + D = c then D - B = 0 thus keeping the maxLen var
        int prefixSum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            if(prefixSum == 0){
                maxLen = i + 1;
            }else{
                if(!(map.containsKey(prefixSum))){
                    map.put(prefixSum, i);
                }
                if(map.containsKey(prefixSum)){
                    int firstOccurance = map.get(prefixSum);
                    int diff = i - firstOccurance;
                    maxLen = Math.max(maxLen, diff);
                }
            }    
        }
        return maxLen;
    }
}