class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;
        int c = grid[0].length;
        int t = r * c;

        k %= t;

        int[][] res = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int in = i * c + j;
                int ni = (in + k) % t;

                int nr = ni / c;
                int nc = ni % c;

                res[nr][nc] = grid[i][j];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                row.add(res[i][j]);
            }
            ans.add(row);
        }

        return ans;
    }
}