class Solution {
    public int countBattleships(char[][] board) {
        boolean[][] vis = new boolean[board.length][board[0].length];
        
        int count = 0;
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if(board[i][j] == 'X' && !vis[i][j]) {
                    count++;
                    dfs(board, vis, i, j);
                }
        
        return count;
    }
    
    void dfs(char[][] board, boolean[][] vis, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length) 
            return;
        if (vis[i][j] || board[i][j] != 'X')
            return; 
        vis[i][j] = true;
        dfs(board, vis, i + 1, j);
        dfs(board, vis, i - 1, j);
        dfs(board, vis, i, j + 1);
        dfs(board, vis, i, j - 1);

    }
}