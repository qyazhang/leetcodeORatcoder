
package Atcoder.AtcoderContest190511;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class test4 {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);

    long n = cin.nextLong();
    long res = 1;
//    for (long i=1;i<=n/2;i++) {
//      if (n%i==0) {
//        res = res + n/i -1;
////        System.out.println(i);
//      }
//    }
    HashMap<Long, Long> rec = resolvePrime(n);
    long factorNum = 1;
    for (Long name: rec.keySet()){

      Long value = rec.get(name);
      long temp = 0;
      for (long i=0;i<=value;i++) {
        long pw = (long)Math.pow(name, i);
        temp += pw;
        System.out.println(name+"^"+i+"="+pw);
      }
      factorNum = factorNum * (value+1);
      res = res * temp;
    }

    System.out.println(res-factorNum);
  }

  public static HashMap<Long, Long> resolvePrime(long num) {

//    StringBuffer sb = new StringBuffer(num + "=");
    HashMap<Long, Long> res = new HashMap<>();
    long i = 2;

    while (i <= num) {

      if (num % i == 0) {

        if (res.containsKey(i)){
          res.put(i, res.get(i)+1);
        }
        else {
          res.put(i, 1L);
        }
//        sb.append(i + "*");
        num = num / i;
        i = 2;
      } else {
        i++;
      }
    }

    return res;
  }
}

