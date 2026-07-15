class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh=0;
        int m=grid.length;
        int n=grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1) 
                {
                    fresh++;
                }
                else if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j,0});
                }
            }
        }
        int [][] dir={{-1,0},{0,-1},{0,1},{1,0}};
        int time=0;
        while(!q.isEmpty())
        {
            int [] curr=q.poll();
            for(int k=0;k<4;k++)
            {
                int x=curr[0]+dir[k][0];
                int y=curr[1]+dir[k][1];

                if(x>=0 && y>=0 && x<m && y<n && grid[x][y]==1)
                {
                    time=Math.max(time,curr[2]+1);
                    q.offer(new int[]{x,y,curr[2]+1});
                    grid[x][y]=2;
                    fresh--;
                }
            }
        }

        

        return fresh==0?time:-1;
    }
}
