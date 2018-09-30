package CompanyContest;

import java.io.*;
import java.util.Scanner;

public class google1 {

    public static void main(String[] args) throws IOException {

//        int count = 0;
//        for (int i=0;i<143;i++){
//            if (i%2==0) continue;
//            if (i%3==0) continue;
//            if (i%5==0) continue;
//            count++;
//        }
        int time = 360;
        System.out.println((time/60) + ":" + String.format("%02d",time%60));
        //count = 4845+15504+38760+77520+125970+167960+184756+167960+125970+77520+38760+15504+4845+1140+190+20+1;
        //System.out.println(count);

    }

    static public int wiggleMaxLength(int[] nums) {
        int[] diff = new int[nums.length-1];
        for (int i=0;i<diff.length;i++){
            int temp = nums[i+1]-nums[i];
            if (temp==0) diff[i] = 0;
            else if (temp<0) diff[i] = -1;
            else diff[i] = 1;
        }
        int max = 0;
        int len = 0;
        if (diff[0]==0) len = 0;
        else len = 1;
        System.out.println(len);
        for (int i=1;i<diff.length;i++){
            if (diff[i]==0) {
                max = Math.max(max, len);
                len = 0;
            }
            else if (diff[i-1]*diff[i]==-1) {
                len++;
                max = Math.max(max, len);
            }
            else if (diff[i-1]*diff[i]==1) {
                max = Math.max(max, len);
                len = 1;
            }
            else {
                len = 1;
            }
            System.out.println(len+" "+max);
        }
        return max+1;
    }

}
