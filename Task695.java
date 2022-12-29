public class Task695 {
    public int maxAreaOfIsland(int[][] grid) {
        int ansver = 0;

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[0].length; ++j) {
                ansver = Math.max(ansver, dfs(grid, i, j));
            }
        }

        return ansver;
    }

    public int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length) return 0;
        if (grid[i][j] != 1) return 0;

        grid[i][j] = 2;

        return 1 + dfs(grid, i + 1, j) + dfs(grid, i - 1, j)
                + dfs(grid, i, j + 1) + dfs(grid, i, j - 1);
        
    }
}