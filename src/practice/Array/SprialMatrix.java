package practice.Array;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
  //TODO: 这个旋转方法好像还是有问题
//  public List<Integer> spiralOrder(int[][] matrix) {
//
//    int row = matrix.length;
//    List<Integer> res = new ArrayList<>();
//    if (row==0) return res;
//    int col = matrix[0].length;
//    int rowStart = 0;
//    int colStart = 0;
//    while (row>=rowStart && col>=colStart) {
//      System.out.println(row+" "+col+" "+rowStart+" "+colStart);
//      for (int i=colStart;i<col-1;i++) {
//        res.add(matrix[rowStart][i]);
//      }
////      rowStart++;
//
//      for (int i=rowStart;i<row-1;i++) {
//        res.add(matrix[i][col-1]);
//      }
////      col--;
//
//      if (rowStart<=row) {
//        for (int i=col-1;i>colStart;i--) {
//          res.add(matrix[row-1][i]);
//        }
////        row--;
//      }
//
//      if (colStart<=col) {
//        for (int i=row-1;i>rowStart;i--) {
//          res.add(matrix[i][colStart]);
//        }
////        colStart++;
//      }
//      rowStart++;
//      colStart++;
//      col--;
//      row--;
//
//    }
//    //这种旋转方式，如果是正方且奇数的话，中间的那个数会少掉
//    if (matrix.length==matrix[0].length && matrix.length%2==1){
//      res.add(matrix[matrix.length/2][matrix.length/2]);
//    }
//    return res;
//
//  }

    public List<Integer> spiralOrder(int[][] matrix) {

    int row = matrix.length-1;
    List<Integer> res = new ArrayList<>();
    if (row+1==0) return res;
    int col = matrix[0].length-1;
    int rowStart = 0;
    int colStart = 0;
    while (row>=rowStart && col>=colStart) {
      System.out.println(row+" "+col+" "+rowStart+" "+colStart);
      for (int i=colStart;i<=col;i++) {
        res.add(matrix[rowStart][i]);
      }
      rowStart++;

      for (int i=rowStart;i<=row;i++) {
        res.add(matrix[i][col]);
      }
      col--;

      if (rowStart<=row) {
        for (int i=col;i>=colStart;i--) {
          res.add(matrix[row][i]);
        }
        row--;
      }

      if (colStart<=col) {
        for (int i=row;i>=rowStart;i--) {
          res.add(matrix[i][colStart]);
        }
        colStart++;
      }


    }

    return res;

  }

}
