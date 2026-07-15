class Solution {
    public boolean canFinish(int n, int[][] prereq) {
        // crreate adj for prereq
        // perform bfs if the node is already visited then it is a cycle then return false
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prereq.length;i++){
        int u=prereq[i][0]; 
        int v=prereq[i][1];
        adj.get(u).add(v);
        }
        boolean [] vis=new boolean[n];
        boolean[] path=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!vis[i])
                 if(dfs(adj,i,vis,path)) return false;
        }

        return true;
    }

    public boolean dfs( ArrayList<ArrayList<Integer>> adj,int node,boolean [] vis,boolean [] path)
    {
        if(path[node]) return true;
        if(vis[node]) return false;
        vis[node]=true;
        path[node]=true;
        ArrayList<Integer> neigh=adj.get(node);
        for(int n:neigh)
           if(dfs(adj,n,vis,path)) return true;
        path[node]=false;
        return false;
    }
}