package leetcode.leetcodeContest0902;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class test3 {

    public static void main(String[] args) {
        int[] ex = {1,2,4};
        System.out.println(subarrayBitwiseORs(ex));
    }

    public static int subarrayBitwiseORs(int[] A) {

        Set res = new HashSet();
        for (int i=1;i<=A.length;i++) {

            for (int j=0;j<=A.length-i;j++) {

                int[] temp = Arrays.copyOfRange(A, j, j+i);
                int item = ArrOr(temp);
                res.add(item);

            }

        }
        return res.size();

    }

    public static int ArrOr (int[] in) {

        if (in.length==1) return in[0];
        else if (in.length==2) return in[0]|in[1];
        else {
            int res = in[0]|in[1];
            for (int i=2;i<in.length;i++){
                res = res|in[i];
            }
            return res;
        }

    }


}
