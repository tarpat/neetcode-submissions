class Solution {
    public int numIslands(char[][] grid) {
        // visted to make sure we don't go in island again
        // go through each spot and go in every direction
        // mark each as visited as we check them
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int numIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    markIsland(visited, grid, i, j);
                    numIslands++;
                }
            }
        }

        return numIslands;
    }

    public void markIsland(boolean[][] visited, char[][] grid, int i, int j) {
        if (i == grid.length || i < 0 || j == grid[0].length || j < 0) {
            return;
        }
        if (visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        if (grid[i][j] =='0') {
            return;
        }
        markIsland(visited, grid, i-1, j);
        markIsland(visited, grid, i+1, j);
        markIsland(visited, grid, i, j-1);
        markIsland(visited, grid, i, j+1);
    }
}
