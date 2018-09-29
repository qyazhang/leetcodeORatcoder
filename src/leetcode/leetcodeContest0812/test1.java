package leetcodeContest0812;

import java.util.ArrayList;

public class test1 {

    public static void main() {

    }

    public static String[] uncommonFromSentences(String A, String B) {

        String[] res1 = findOne(A,B);
        String[] res2 = findOne(B,A);

        String[] res = new String[res1.length+res2.length];
        System.arraycopy(res1,0,res,0,res1.length);
        System.arraycopy(res2,0,res,res1.length,res2.length);
        return res;

    }



    public static String[]  findOne (String A, String B) {

        String[] AS = A.split(" ");
        String[] BS = B.split(" ");

        ArrayList<String> res = new ArrayList<String>();

        for (int i=0;i<AS.length;i++) {
            int mark1 = 0;
            for (int j=0;j<AS.length;j++) {
                if (i==j) continue;
                else {
                    if (AS[i].equals(AS[j])) {
                        mark1 = 1;
                        break;
                    }
                    else continue;
                }
            }
            if (mark1==1) continue;
            int mark = 0;
            for (int j=0;j<BS.length;j++) {
                if (BS[j].equals(AS[i])) {
                    mark = 1;
                    break;
                }
            }
            if (mark==0)  res.add(AS[i]);
        }

        String[] ar = res.toArray(new String[0]);
        return (String[]) ar;

    }

}
