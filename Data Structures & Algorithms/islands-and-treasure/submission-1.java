class Solution {

    int [][] dir={{0,-1},{-1,0},{0,1},{1,0}};
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length, n = grid[0].length;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    q.add(new int[]{i, j});
                }
            }
        }

        while(!q.isEmpty())
        {
            int[] curr = q.poll();
            for(int k=0;k<4;k++)
            {
                int x=dir[k][0]+curr[0];
                int y=dir[k][1]+curr[1];
                if(x>=0 && y>=0 && x<m && y<n && grid[x][y] == Integer.MAX_VALUE)
                {
                    grid[x][y] = grid[curr[0]][curr[1]] + 1;
                    q.offer(new int[]{x, y});
                }
            }
        }
    }
}