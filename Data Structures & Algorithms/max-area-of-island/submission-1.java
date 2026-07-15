class Solution {
    int [][] dir={{0,-1},{-1,0},{0,1},{1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        
        int ans=0;

        for(int i=0;i<grid.length;i++)
        { 
            for(int j=0;j<grid[0].length;j++)
            { 
                if(grid[i][j]==1)
                {
                    ans=Math.max(ans,dfs(grid,i,j));
                }
            }
        }
        return ans;
    }

    public int dfs(int[][] grid,int i,int j)
    {
        grid[i][j]=0;
        int area = 1;
        for(int k=0;k<4;k++)
        {
            int x=i+dir[k][0];
            int y=j+dir[k][1];

            if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y]==1)
            {
                area += dfs(grid,x,y);
            }
        }

        return area;
    }
}