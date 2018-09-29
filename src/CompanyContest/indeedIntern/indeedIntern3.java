package indeedIntern;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class indeedIntern3 {

    public static void main(String[] args) {

        Scanner cin = null;
        try {
            cin = new Scanner(new FileReader("input1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Scanner cin = new Scanner(System.in);
        int stoneNum = cin.nextInt();
        int operationNum = cin.nextInt();
        int[] stone = new int[stoneNum];
        String[] op = new String[operationNum];
        for (int i = 0; i < stoneNum; i++) {
            stone[i] = cin.nextInt();
        }
        for (int i = 0; i < operationNum; i++) {
            op[i] = cin.next();
        }

        int[] func = new int[operationNum];
        func[0] = (int) Math.pow(stoneNum, 2);
        int[] newCond = new int[(int) Math.pow(2, stoneNum)];
        for (int i = 0; i < newCond.length; i++) {
            newCond[i] = 1;
        }
        for (int i = 0; i < operationNum; i++) {
            int[] oldCond = newCond;
            newCond = new int[newCond.length];
            for (int j = 0; j < oldCond.length; j++) {
                if (judge(stone, j, op[i])){
                    newCond[j]+=oldCond[j];
                }
                for (int k = 0; k < stoneNum; k++) {
                    int newPos = j ^ 1 << k;
                    if (judge(stone, newPos, op[i])){
                        newCond[newPos]+=oldCond[j];
                    }
                }
            }
        }
        int sum = 0;
        for (int i=0;i<newCond.length;i++){
            sum+=newCond[i];
        }
        System.out.println(sum);
    }

    public static boolean judge (int[] stone, int position, String ope) {

        String posString = Integer.toBinaryString(position);
        int left = 0;
        int right = 0;
        for (int i=0;i<posString.length();i++) {
            if (posString.charAt(i)=='0')
                left+=stone[i];
            else right+=stone[i];
        }
        if (ope.equals(">")){
            if (left>right) return true;
            else return false;
        }
        else if (ope.equals("<")){
            if (left<right) return true;
            else return false;
        }
        else if (ope.equals(">=")){
            if (left>=right) return true;
            else return false;
        }
        else{
            if (left<=right) return true;
            else return false;
        }
    }

}
