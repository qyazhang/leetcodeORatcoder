package practice.Array;

public class SetMatrixZeroes {

  //这个是空间O(1)的方法，自己想的时候就是新开一个array，用来记录哪一行那一列是0，是空间O(m+n)的方法。
  public void setZeroes(int[][] matrix) {
    boolean fr = false,fc = false;
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix[0].length; j++) {
        if(matrix[i][j] == 0) {
          if(i == 0) fr = true;
          if(j == 0) fc = true;
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }//use fir row and first col to record whether this col or row is 0 or not
    //fr and fc are used to record the condition of first row and first col

    for(int i = 1; i < matrix.length; i++) {
      for(int j = 1; j < matrix[0].length; j++) {
        if(matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    if(fr) {
      for(int j = 0; j < matrix[0].length; j++) {
        matrix[0][j] = 0;
      }
    }
    if(fc) {
      for(int i = 0; i < matrix.length; i++) {
        matrix[i][0] = 0;
      }
    }

  }

}
