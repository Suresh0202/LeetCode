class Solution {
    public int repeatedNTimes(int[] arr) {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>=arr.length/2)
            {
                max=arr[i];
            }
        }
        return max;
    }
}