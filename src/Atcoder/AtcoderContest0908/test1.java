
package Atcoder.AtcoderContest0908;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class test1 {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner (System.in);

    int a = cin.nextInt();
    int b = cin.nextInt();

    if (a*b%2==0) System.out.println("No");
    else System.out.println("Yes");


  }

}
