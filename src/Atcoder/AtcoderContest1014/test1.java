
package Atcoder.AtcoderContest1014;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class test1 {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int count = 0;
    int n0 = n;
    while (n<=100) {
      count++;
      n += n0;
    }
    System.out.println(100-count);

  }

}
