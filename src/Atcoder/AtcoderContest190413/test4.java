package Atcoder.AtcoderContest190413;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class test4 {

  static int mod = 1000000007;

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int k = cin.nextInt();
    String s = cin.next();
    Queue<Integer> rec = new LinkedList<>();
    int mark = s.charAt(0) - '0';
    int count = 0;
    int countOne = 0;
    int countZero = 0;
    for (int i = 0; i < s.length(); i++) {
      if (mark == s.charAt(i) - '0') {
        count++;
      } else if (mark != s.charAt(i) - '0' && mark == 0) {
        rec.add(-count);
        count = 1;
        mark = 1;
        countZero++;
      } else if (mark != s.charAt(i) - '0' && mark == 1) {
        rec.add(count);
        count = 1;
        mark = 0;
        countOne++;
      }

      if (i == s.length() - 1 && mark == 1) {
        rec.add(count);
        countOne++;
      } else if (i == s.length() - 1 && mark == 0) {
        rec.add(-count);
        countZero++;
      }
    }

    for (int i : rec) {
      System.out.println(i);
    }

    if (k == 0) {
      System.out.println(Math.max(Collections.max(rec), 0));
      return;
    }

    if (k >= countZero) {
      System.out.println(s.length());
      return;
    } else {
      int sum = 0;
      int maxLen = 0;
      Queue<Integer> pool = new LinkedList<>();
      if (rec.peek() <= 0) {
        count = 0;
        while (count < k * 2) {
          int temp = rec.poll();
          pool.add(temp);
          sum += Math.abs(temp);
          count++;
        }
        int zeroItem = 0;
        int oneItem = 0;
        while (!rec.isEmpty()) {
          if (pool.peek()<=0) {
            sum += pool.poll();
          }
          zeroItem = rec.poll();
          if (!rec.isEmpty()) {
            oneItem = rec.poll();
          }
          sum -= Math.abs(pool.poll());

        }
      } else {
        count = 0;
        while (count < k * 2 + 1) {
          int temp = rec.poll();
          pool.add(temp);
          sum += Math.abs(temp);
          count++;
        }
      }


    }

  }


}
