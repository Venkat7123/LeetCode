class Solution {
    public boolean containsCycle(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] groups = new int[rows * cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                groups[i * cols + j] = i * cols + j;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int id = i * cols + j;
                char c = grid[i][j];

                if (i + 1 < rows && grid[i+1][j] == c) {
                    int aGroup = find(id, groups);
                    int bGroup = find( (i + 1) * cols + j, groups);

                    if (aGroup == bGroup) return true;
                    groups[aGroup] = bGroup;
                }

                if (j + 1 < cols && grid[i][j+1] == c) {
                    int aGroup = find(id, groups);
                    int bGroup = find( i * cols + j + 1, groups);

                    if (aGroup == bGroup) return true;
                    groups[aGroup] = bGroup;
                }
            }
        }

        return false;
    }

    private int find(int id, int[] groups) {
        if (id == groups[id]) return id;
        groups[id] = find(groups[id], groups);
        return groups[id];
    }
}
