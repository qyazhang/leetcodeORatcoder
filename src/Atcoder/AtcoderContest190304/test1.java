
package Atcoder.AtcoderContest190304;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class test1 {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);

    int a = cin.nextInt();
    int b = cin.nextInt();
    int c = cin.nextInt();

    System.out.println(Math.min(b / a, c));


  }

}
