
package Atcoder.AtcoderContest1222;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class test3 {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    double[] rate = new double[n];
    long temp = cin.nextLong();
    for (int i=0;i<n-1;i++) {
      long in = cin.nextLong();
      rate[i] = in / temp;
      temp = in;
    }


  }

}
