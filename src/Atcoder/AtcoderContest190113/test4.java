package Atcoder.AtcoderContest190113;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class test4 {

  static int mod = 1000000007;

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);

    int N = cin.nextInt();
    int M = cin.nextInt();

    int[][] maxMatrix = new int[N][M];
    int[] A = new int[N];
    int[] B = new int[M];
    for (int i=0;i<N;i++) {
      A[i] = cin.nextInt();
    }
    for (int i=0;i<M;i++) {
      B[i] = cin.nextInt();
    }
    for (int i=0;i<N;i++) {
      for (int j=0;j<M;j++) {
        if (A[i]>=B[j]) maxMatrix[i][j] = B[j];
        else maxMatrix[i][j] = A[i];
      }
    }

    System.out.println(Arrays.toString(maxMatrix));
  }


}
