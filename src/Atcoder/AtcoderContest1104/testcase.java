package Atcoder.AtcoderContest1104;

import java.io.FileNotFoundException;
import java.util.Random;

public class testcase {

  public static void main(String[] args) throws FileNotFoundException {
    for (int i=0;i<5000;i++) {
//      System.out.println(randInt(1,1000)+" "+randInt(1, 10000));
      System.out.println(Integer.MAX_VALUE - 1000000007);
    }
  }

  public static int randInt(int Min, int Max) {

    return Min + (int)(Math.random() * ((Max - Min) + 1));

  }

}
