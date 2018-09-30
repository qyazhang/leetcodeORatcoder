package leetcode.leetcodeContest0805;

public class test1 {

    public int projectionArea(int[][] grid) {
        return findX(grid)+findY(grid)+findZ(grid);
    }

    public int findX(int[][] grid) {

        int len1 = grid.length;
        int len2 = grid[0].length;
        int sum = 0;
        for (int i=0;i<len1;i++){
            for (int j=0;j<len2;j++){
                if (grid[i][j]!=0) sum++;
            }
        }
        return sum;

    }

    public int findY(int[][] grid) {

        int len1 = grid.length;
        int len2 = grid[0].length;
        int sum = 0;
        for (int i=0;i<len1;i++){
            int max = 0;
            for (int j=0;j<len2;j++){
                if (grid[i][j]>max){
                    max = grid[i][j];
                }
            }
            sum+=max;
        }
        return sum;

    }

    public int findZ(int[][] grid) {

        int len1 = grid.length;
        int len2 = grid[0].length;
        int sum = 0;
        for (int i=0;i<len1;i++){
            int max = 0;
            for (int j=0;j<len2;j++){
                if (grid[j][i]>max){
                    max = grid[j][i];
                }
            }
            sum+=max;
        }
        return sum;

    }

}
