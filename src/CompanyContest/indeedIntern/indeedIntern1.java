package indeedIntern;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class indeedIntern1 {

    public static void main(String[] args) {
//        Scanner cin = null;
//        try {
//            cin = new Scanner(new FileReader("input1.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        Scanner cin = new Scanner(System.in);
        int len = cin.nextInt();
        int[] vote = new int[len];
        for (int i=0;i<len;i++) {

            int tempVote = cin.nextInt();
            vote[i] = tempVote;

        }
        String WL = cin.next();
        int min = 0;
        int max = 0;
        for (int i=0;i<len;i++) {
            char tempWL = WL.charAt(i);
            int num = vote[i];
            if (tempWL=='W') {
                min+=(num/2+1);
                max+=num;
            }
            else if (tempWL=='L') {
                min+=0;
                if (num%2==0) {
                    max+=(num/2-1);
                }
                else {
                    max+=num/2;
                }
            }
            else {
                min+=num/2;
                max+=num/2;
            }
        }
        System.out.println(min+" "+max);

    }

}
