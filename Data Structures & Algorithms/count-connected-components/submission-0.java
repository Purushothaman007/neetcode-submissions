class Solution {
    public int countComponents(int n, int[][] edges) {
      
      ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
      for(int i=0;i<n;i++)
      {
          adj.add(new ArrayList<>());
      }

      for(int [] arr:edges)
      {
        adj.get(arr[0]).add(arr[1]);
        adj.get(arr[1]).add(arr[0]);
      }
      
      int cnt=0;
      boolean [] vis=new boolean[n];
      for(int i=0;i<n;i++)
      {
        if(!vis[i])
        {
            dfs(adj,i,vis);
            cnt++;
        }
      }

      return cnt;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,int node,boolean[]vis)
    {
        vis[node]=true;
        ArrayList<Integer> neigh=adj.get(node);
        for(int n:neigh)
        {
          if(!vis[n])
          {
            dfs(adj,n,vis);
          }
        }
    }
}
