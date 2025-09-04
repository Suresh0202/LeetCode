class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int n = arr.length;
        
        int total = arr[0];
        int currMax = arr[0], maxSum = arr[0];
        int currMin = arr[0], minSum = arr[0];
        
        for (int i = 1; i < n; i++) {  // \U0001f448 start from index 1
            int x = arr[i];
            total += x;
            
            // Kadane for max subarray
            currMax = Math.max(x, currMax + x);
            maxSum = Math.max(maxSum, currMax);
            
            // Kadane for min subarray
            currMin = Math.min(x, currMin + x);
            minSum = Math.min(minSum, currMin);
        }
        
        // If all numbers are negative → return the largest (maxSum)
        if (maxSum < 0) return maxSum;
        
        // Otherwise, either normal max or circular max
        return Math.max(maxSum, total - minSum);
    }
}