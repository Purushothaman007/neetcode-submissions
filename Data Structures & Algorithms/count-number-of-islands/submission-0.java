class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1')
                {
                dfs(grid,i,j,n,m);
                cnt++;
                }
            }
        }
        return cnt;
    }

    public void dfs(char[][] grid,int i,int j,int n,int m)
    {
        int [][] dir={{-1,0},{0,-1},{0,1},{1,0}};
        grid[i][j]='0';
        for(int [] arr:dir)
        {
            int x=i+arr[0];
            int y=j+arr[1];

            if(x>=0 && x<n && y>=0 && y<m && grid[x][y]=='1')
            {
                dfs(grid,x,y,n,m);
            }
        }
    }
}
