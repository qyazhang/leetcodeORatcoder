package leetcodeContest;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class test2 {

    public static void main(String[] args) {

        int[] in1 = {2,7,11,15};
        int[] in2 = {1,10,4,11};
//        int[] in1 = {12,24,8,32};
//        int[] in2 = {13,25,32,11};
        int[] out = advantageCount(in1, in2);
        for (int i=0;i<out.length;i++){
            System.out.println(out[i]);
        }

    }

    public static int[] advantageCount(int[] A, int[] B) {

        int len = A.length;
        int[] temp = new int[len];
        int[] used = new int[len];
        for (int i=0;i<len;i++) {
            temp[i] = -1;
        }
        for (int i=0;i<A.length;i++){

            int min = Integer.MAX_VALUE;
            int pos = 0;
            for (int j=0;j<B.length;j++) {
                int diff = A[i]-B[j];
                if (diff>0&&diff<min){
                    min = diff;
                    pos = j;
                }
            }
            if (min!=Integer.MAX_VALUE) {
                temp[pos] = A[i];
                used[i] = 1;
            }
        }
        int pos1 = 0;
        int pos2 = 0;
        while(true){

            if (temp[pos1]!=-1)
                pos1++;
            else if (used[pos2]!=0)
                pos2++;
            else if (temp[pos1]==-1&&used[pos2]==0){
                temp[pos1] = A[pos2];
                pos1++;
                pos2++;
            }
            if (pos1>=len||pos2>=len) break;
        }
//        Arrays.sort(A);
//        Arrays.sort(B);
//        int pos1 = 0;
//        int pos2 = 0;
//
//        for (int i=0;i<len;i++){
//
//        }

        return temp;

    }

}
