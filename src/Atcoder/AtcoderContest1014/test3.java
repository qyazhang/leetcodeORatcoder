
package Atcoder.AtcoderContest1014;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class test3 {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    char[][] res = new char[n][n];
    if (n==1) {
      res[0][0] = 'X';
      for (int i=0;i<n;i++) {
        System.out.println(res[i]);
      }
      return;
    }
    int mark = 0;
    int countX = 0;
    for (int i=0;i<n;i++) {
      for (int j=0;j<n;j++) {
        if (i%5==0) {
          if (j%5==1) {
            res[i][j] = 'X';
            countX++;
          }
          else res[i][j] = '.';
        }
        else if (i%5==1) {
          if (j%5==3) {
            res[i][j] = 'X';
            countX++;
          }
          else res[i][j] = '.';
        }
        else if (i%5==2) {
          if (j%5==0) {
            res[i][j] = 'X';
            countX++;
          }
          else res[i][j] = '.';
        }
        else if (i%5==3) {
          if (j%5==2) {
            res[i][j] = 'X';
            countX++;
          }
          else res[i][j] = '.';
        }
        else if (i%5==4) {
          if (j%5==4) {
            res[i][j] = 'X';
            countX++;
          }
          else res[i][j] = '.';
        }
      }
    }
    for (int i=0;i<n;i++) {
      if (res[0][Math.max(0,i-1)]!='X'&&res[0][Math.min(n-1,i+1)]!='X'&&res[1][i]!='X') {
        res[0][i]='X';
        countX++;
      }
      if (res[n-1][Math.max(0,i-1)]!='X'&&res[n-1][Math.min(n-1,i+1)]!='X'&&res[n-2][i]!='X') {
        res[n-1][i]='X';
        countX++;
      }
      if (res[Math.max(0,i-1)][0]!='X'&&res[Math.min(n-1,i+1)][0]!='X'&&res[i][1]!='X') {
        res[i][0]='X';
        countX++;
      }
      if (res[Math.max(0,i-1)][n-1]!='X'&&res[Math.min(n-1,i+1)][n-1]!='X'&&res[i][n-2]!='X') {
        res[i][n-1]='X';
        countX++;
      }
    }
//    for (int i=0;i<n;i++) {
//      for (int j=0;j<n;j++) {
//        if (res[])
//      }
//    }
//    for (int j=0;j<n;j++){
//      if (res[])
//    }
    for (int i=0;i<n;i++) {
      System.out.println(res[i]);
    }
    System.out.println(countX);
  }

}

