
package Atcoder.AtcoderContest190413.AtcoderContest190304;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class test1 {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);

    int a = cin.nextInt();
    int b = cin.nextInt();

    int res = 0;
    if (a>=b) {
      res+=a;
      a--;
    }
    else {
      res+=b;
      b--;
    }

    if (a>=b) {
      res+=a;
      a--;
    }
    else {
      res+=b;
      b--;
    }
    System.out.println(res);
  }

}
