class Solution {
    public int largestRectangleArea(int[] h) {
        
        int ans=Integer.MIN_VALUE;
        int n=h.length;

       int [] prev=new int[n];
       int [] next=new int[n];
       Arrays.fill(next, n);
       Arrays.fill(prev, -1);
       Stack<Integer> stk=new Stack<>();

       for(int i=0;i<n;i++)
       {
            while(!stk.isEmpty() && h[stk.peek()]>h[i])
            {
                next[stk.pop()]=i;
            }
            stk.push(i);
       }
       stk.clear();
       for(int i=n-1;i>=0;i--)
       {
          while(!stk.isEmpty() && h[stk.peek()]>h[i])
          {
            prev[stk.pop()]=i;
          }
          stk.push(i);
       } 
        for(int p:prev) System.out.print(p);
        System.out.println("");
        for(int nex:next) System.out.print(nex);
        for(int i=0;i<n;i++)
        {
            ans=Math.max(ans,h[i]*(next[i]-prev[i]-1));
        }

        return ans;
    }
}
