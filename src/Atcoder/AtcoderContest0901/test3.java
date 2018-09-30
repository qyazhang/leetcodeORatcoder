
package Atcoder.AtcoderContest0901;

import Contest98.TreeNode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class test3 {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));

//    Scanner cin = new Scanner(System.in);
    int K = cin.nextInt();
    int N = cin.nextInt();

    long total = combination(N+K-1, K-1);

    System.out.println(total);

    for (int i=2;i<=K+1;i++) {

      int temp = i/2;
      long diff1 = combination((N-2)+K-1, K-1);
      long diff2 = 0;
      if (N-2>=2) {
        diff2 = combination((N-4)+K-1, K-1);
      }
      System.out.println(total-diff1*temp+diff2);

    }

  }

  private static long factorial(int n) {
    return (n > 1) ? n * factorial(n - 1) : 1;
  }

  public static long combination(int n, int m) {
    return (n >= m) ? factorial(n) / factorial(n - m) / factorial(m) : 0;
  }

}

