class Solution {
    public static int func(int n,int fib[])
    {
         if(n<=1)
        {
            return n;
        }
        if(fib[n]!= -1)
        {
            return fib[n];
        }
        return fib[n]=func(n-1,fib)+func(n-2,fib);
    }

    public int fib(int n) {
          int fib[]=new int[31];
          Arrays.fill(fib,-1);
          return func(n,fib);
       
    }
}