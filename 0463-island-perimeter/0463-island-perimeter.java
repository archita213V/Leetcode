class Solution {
        int bfs(int[][] grid, int sr, int sc) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[m][n];

        int[][] dir = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        q.offer(new int[]{sr, sc});
        visited[sr][sc] = true;

        int perimeter = 0;

        while (!q.isEmpty()) {
            int[] cell = q.poll();

            int r = cell[0];
            int c = cell[1];

            for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
                    perimeter++;
                }
                else if (grid[nr][nc] == 0) {
                    perimeter++;
                }
               
                else if (!visited[nr][nc]) {
                    visited[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return perimeter;
    }
     public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    return bfs(grid, i, j);
                }
            }
        }

        return 0;
    }
}