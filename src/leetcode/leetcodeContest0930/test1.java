package leetcode.leetcodeContest0930;

import java.util.Arrays;

public class test1 {

  public static void main(String[] args) {

  }

  public boolean hasGroupsSizeX(int[] deck) {

    Arrays.sort(deck);
    int num = -1;
    int count = 0;
    StringBuffer time = new StringBuffer();
    for (int i = 0; i < deck.length; i++) {
      if (i==0) {
        num = deck[i];
        count++;
        continue;
      }
      if (deck[i] != num) {
        time.append(count + ",");
        num = deck[i];
        count = 1;
      } else {
        count++;
      }
    }
    time.append(count + ",");
    System.out.println(time.toString());
    String[] temp = time.substring(0, time.length()-1).split(",");
    int[] res = new int[temp.length];
    for (int i = 0; i < res.length; i++) {
      res[i] = Integer.parseInt(temp[i]);
    }

    int gcd = gcdArr(res);
    if (gcd==1) return false;
    else return true;

  }

  public static int gcdFunc(int m, int n) {
    if (m < n) {
      int temp = m;
      m = n;
      n = temp;
    }
    if (m % n == 0) {
      return n;
    } else {
      return gcdFunc(n, m % n);
    }
  }

  public static int gcdArr(int[] a) {
    int gcd = a[0];
    for (int i = 1; i < a.length; i++)
      gcd = gcdFunc(gcd, a[i]);
    return gcd;
  }

}
