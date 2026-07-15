class Solution {
    int [][] dir={{-1,0},{0,-1},{0,1},{1,0}};
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean [][] vis=new boolean[m][n];
        boolean [][] path=new boolean[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if(solve(board,word,i,j,1,vis,path)) return true;
                }
            }
        }

        return false;
    }

    public boolean solve(char[][] grid,String word,int i,int j,int index,boolean [][] vis,boolean [][] path)
    {
        if(index>word.length()-1) return true;
        if(path[i][j]) return false;
        vis[i][j]=true;
        path[i][j]=true;
        for(int k=0;k<4;k++)
        {
            int x=i+dir[k][0];
            int y=j+dir[k][1];

            if(x>=0  && y>=0  && x<grid.length &&  y<grid[0].length && !path[x][y] && grid[x][y]==word.charAt(index))
            {
                if(solve(grid,word,x,y,index+1,vis,path)) return true;
            }
        }
        path[i][j]=false;
        return false;
    }
}
