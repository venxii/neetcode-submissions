class Solution {
    private int maxCount = 0;
    private int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length, col = grid[0].length, area = 0;
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if (grid[r][c] == 1) area = dfs(grid, r, c);
                maxCount = Math.max(maxCount, area);
            }
        }
        return maxCount;
    }

    private int dfs(int[][] grid, int r, int c){
        if (r < 0 || c < 0 || r >= grid.length ||c >= grid[0].length || grid[r][c] == 0) return 0;

        grid[r][c] = 0;
        int area = 1;
        for (int[] dir : directions) {
            area += dfs(grid, r + dir[0], c + dir[1]);
        }
        return area;
    }
}
