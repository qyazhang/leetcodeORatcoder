package Atcoder.AtcoderContest1104;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class test4 {

  static int mod = 1000000007;

  public static void main(String[] args) throws FileNotFoundException {

    Scanner cin = new Scanner(new FileReader("input.txt"));
//    Scanner cin = new Scanner(System.in);
    int h = cin.nextInt();
    int w = cin.nextInt();
    int k = cin.nextInt();



  }

//  public static int helper(int h, int w, int k) {
//    if (h==1) {
//      if (k==2) return (int)Math.pow(2, Math.max(0,k-3));
//      else return 0;
//    }
//    else {
//      if (k==1) {
//        int temp1 = (helper(h-1, w, k) * 5)%mod;
//        int temp2 = (helper(h-1,w,k+1) + (int)Math.pow(2,Math.max(0,w-3)))%mod;
//        return (temp1+temp2)%mod;
//      }
//      else if (k==w) {
//        int temp1 = (helper(h-1, w, k) * (int)Math.pow(2,Math.max(0,w-2)))%mod;
//        int temp2 = (helper(h-1,w,k-1) + (int)Math.pow(2,Math.max(0,w-3)))%mod;
//        return (temp1+temp2)%mod;
//      }
//      else {
//        int temp1 = (helper(h-1, w, k) * (int)Math.pow(2,Math.max(0,w-2)))%mod;
//      }
//    }
//  }


}
