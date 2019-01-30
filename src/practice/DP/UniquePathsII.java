package practice.DP;

public class UniquePathsII {

  public int uniquePathsWithObstacles(int[][] obstacleGrid) {

    if (obstacleGrid==null||obstacleGrid.length==0||obstacleGrid[0].length==0)
      return 0;
    if (obstacleGrid[0][0] == 1) return 0;

    int row = obstacleGrid.length;
    int col = obstacleGrid[0].length;

    int[][] path = new int[row][col];
    path[0][0] = 1;
    for (int i=1;i<col;i++) {
      if (path[0][i-1]==1&&obstacleGrid[0][i]==0)
        path[0][i] = 1;
      else
        path[0][i] = 0;
    }
    for (int i=1;i<row;i++) {
      if (path[i-1][0]==1&&obstacleGrid[i][0]==0)
        path[i][0] = 1;
      else
        path[i][0] = 0;
    }

    for (int i=1;i<row;i++) {
      for (int j=1;j<col;j++) {

        if (obstacleGrid[i][j] == 1)
          path[i][j] = 0;
        else
          path[i][j] = path[i-1][j] + path[i][j-1];

      }
    }

    return path[row-1][col-1];

  }

}
