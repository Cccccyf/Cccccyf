package leetcode;
//leetcode_200岛屿数量
//深度优先搜索
//还有栈的解法？
public class question_200 {
    public int numIslands(char[][] grid) {
        int num = 0;
        int row = grid.length;
        int column = grid[0].length;
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<column;j++)
            {
                if(grid[i][j] == '1'){
                    num++;
                    dfs(i,j,grid);
                }
            }
        }
        return num;
    }
    public void dfs(int row,int column,char[][] grid){
        if(row < 0||row >= grid.length||
                column < 0||column >= grid[0].length||grid[row][column] == '0'){
            return;
        }
        grid[row][column] = '0';
        dfs(row+1,column,grid);
        dfs(row-1,column,grid);
        dfs(row,column+1,grid);
        dfs(row,column-1,grid);
    }

}
