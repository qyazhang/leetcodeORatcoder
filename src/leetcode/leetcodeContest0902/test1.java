package leetcodeContest0902;

import java.util.ArrayList;
import java.util.Arrays;

public class test1 {

    public static void main(String[] args) {


    }

    public String reverseOnlyLetters(String S) {

        char[] in = S.toCharArray();
        char[] res = S.toCharArray();

        int pos1 = 0;
        int pos2 = S.length()-1;
        while (pos1<S.length()&&pos2>=0) {
            System.out.println(in[pos1]+" "+res[pos2]);
            if (!isChar(in[pos1])) pos1++;
            else if (!isChar(res[pos2])) pos2--;
            else if (isChar(in[pos1]) && isChar(res[pos2])) {
                res[pos2] = in[pos1];
                pos1++;
                pos2--;
            }
        }
        return String.valueOf(res);

    }

    public boolean isChar(char c) {
        if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')) return true;
        else return false;
    }

}
