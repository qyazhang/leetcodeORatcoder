package Atcoder.AtcoderContest190203;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class test4 {

  static int mod = 1000000007;

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    long maxVal = cin.nextLong();

    int[] countZero = new int[Long.toBinaryString(Long.MAX_VALUE).length()];
    int[] countOne = new int[countZero.length];

    long[] numSave = new long[n];
    for (int i=0;i<n;i++) {
      long num = cin.nextLong();
      numSave[i] = num;
      char[] s = Long.toBinaryString(num).toCharArray();
      System.out.println(Arrays.toString(s));
      for (int j=0;j<countOne.length;j++) {
        if (j < s.length && s[s.length-j-1]=='0')
          countZero[j]++;
        else if (j < s.length && s[s.length-j-1]=='1')
          countOne[j]++;
        else if (j >= s.length)
          countZero[j]++;
      }
    }
    System.out.println("count zero");
    System.out.println(Arrays.toString(countZero));
    System.out.println("count one");
    System.out.println(Arrays.toString(countOne));


    String maxValString = Long.toBinaryString(maxVal);

    char[] maxValChar = new char[countOne.length];

    for (int i=0;i<maxValChar.length;i++) {
      if (i<maxValString.length()){
        if (maxValString.charAt(maxValString.length()-1-i)=='1')
          maxValChar[i] = '1';

        else
          maxValChar[i] = '0';
      }
      else
        maxValChar[i] = '0';
    }
    System.out.println("max");
    System.out.println(Arrays.toString(maxValChar));
    StringBuilder temp = new StringBuilder();
    long res = 0;
    int mark = 0;
    for (int i=countOne.length-1;i>=0;i--) {
      if (countOne[i]!=0||countZero[i]!=0) {
        if (maxValChar[i]=='1'&&mark==0) {
          if (countOne[i]>=countZero[i]) {
            temp.append('0');
            res+=Math.pow(2,i) * countOne[i];
            mark = 1;
          }
          else {
            res+=Math.pow(2,i) * countZero[i];
            temp.append('1');
          }
        }
        else if (maxValChar[i]=='0'&&mark==0) {
          temp.append("0");
          res+=Math.pow(2,i) * countOne[i];
        }
        else if (mark==1) {
          if (countOne[i]>=countZero[i]) {
            temp.append('0');
            res+=Math.pow(2,i) * countOne[i];
          }
          else {
            res+=Math.pow(2,i) * countZero[i];
            temp.append('1');
          }
        }

      }
    }

    System.out.println("resK binary");
//    System.out.println(temp);
    char[] resCharArray = temp.reverse().toString().toCharArray();
    System.out.println(Arrays.toString(resCharArray));

    long resK = 0;
    for (int i=0;i<resCharArray.length;i++) {
      if (resCharArray[i]=='1') {
        resK+=Math.pow(2,i);
      }
    }
    System.out.println("resK");
    System.out.println(resK);
    System.out.println("saved num");
    System.out.println(Arrays.toString(numSave));
    System.out.println("test res");
    long res2 = 0;
    for (long a: numSave) {
      res2+=a^resK;
    }
    System.out.println(res2);
    long testRes = (1^16)+ (6^16)+ (3^16)+ (989^16)+ (78^16)+ (26^16);
    System.out.println(testRes);
    System.out.println("original res");
    System.out.println(res);

  }


}
