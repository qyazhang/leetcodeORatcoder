package Atcoder.AtcoderContest0805;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test4 {

    public static void main(String[] args) throws FileNotFoundException {

        //Scanner cin = new Scanner(System.in);
        Scanner cin = new Scanner(new FileReader("src\\AtcoderContest0805\\task2-test-input.txt"));

        String in = cin.next();
        int sum = 0;
        System.out.println(in);

        int modNum = (int)Math.pow(10,9);

        for (int i=1;i<in.length()-1;i++){
            int leftQ = 0;
            int rightQ = 0;
            long leftCond = 0;
            long rightCond = 0;
            for (int j=i-1;j>=0;j--) {
                if (in.charAt(j)=='A'){
                    leftCond+=Math.pow(3,leftQ);
                    leftCond = leftCond%modNum;
                }
                else if (in.charAt(j)=='?'){
                    leftCond+=Math.pow(3,leftQ);
                    leftCond = leftCond%modNum;
                    leftQ++;
                }
            }
            for (int j=i+1;j<in.length();j++) {
                if (in.charAt(j)=='A'){
                    rightCond+=Math.pow(3,rightQ);
                    rightCond = rightCond%modNum;
                }
                else if (in.charAt(j)=='?'){
                    rightCond+=Math.pow(3,rightQ);
                    rightCond = rightCond%modNum;
                    rightQ++;
                }
            }
            System.out.println("left condition "+leftCond);
            System.out.println("right condition "+rightCond);
            long modRes = leftCond*rightCond%modNum;
            System.out.println("long "+modRes);
            sum = ((int)modRes+sum)%modNum;

        }
        System.out.println(sum);

    }
}

