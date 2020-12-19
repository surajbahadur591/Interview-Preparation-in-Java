public class Problem1 {

    // backtracking - rat in a maze problem
    public static boolean ratInAMaze(int maze[][]) {
        // create path
        int n = maze.length;
        int path[][] = new int[n][n];
        return solveMaze(maze, 0, 0, path);
    }

    public static boolean solveMaze(int maze[][], int i, int j, int path[][]) {
        // check if i , j is a valid cell means it should be 1 and in the bound
        int n = maze.length;
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][i] == 0 || path[i][j] == 1) {
            return false;
        }
        // include cell in current in path
        path[i][j] = 1;

        // if start is the final destination
        if (i == n - 1 && j == n - 1) {
            // path[i][j] = 0;
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < n; c++) {
                    System.out.print(path[r][c] + " ");
                }
                System.out.println();
            }
            return true;
        }

        // explore in top, down, left and right
        // top
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }
        // right
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }
        // down
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }
        // left
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        int maze[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
        boolean pathExists = ratInAMaze(maze);
        System.out.print(pathExists);
    }
}
