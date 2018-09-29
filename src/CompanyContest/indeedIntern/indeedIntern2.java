package indeedIntern;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class indeedIntern2 {

    public static void main(String[] args) {

//        Scanner cin = null;
//        try {
//            cin = new Scanner(new FileReader("input1.txt"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        Scanner cin = new Scanner(System.in);
        String inTemp = cin.nextLine();
        String[] in1 = inTemp.split(" ");
        //System.out.println(in1.length);
        int N = Integer.parseInt(in1[0]);
        int M = Integer.parseInt(in1[1]);
        //int r = Integer.parseInt(in1[2])-1;
        long r = Long.parseLong(in1[2])-1;
        //int c = Integer.parseInt(in1[3])-1;
        long c = Long.parseLong(in1[3])-1;
        //int[][] table= new int[N][M];
        HashSet<String> table = new HashSet<String>();

        String move = cin.next();
        for (int i=0;i<move.length();i++) {
            int oneMove = move.charAt(i);
            if (oneMove=='U') {
                while (r>0){

                    if (table.contains(r+","+c))
                        break;
                    else table.add(r+","+c);
                    r--;
                }
                System.out.println((r+1)+" "+(c+1));
            }
            else if (oneMove=='D') {
                while (r<N-1){

                    if (table.contains(r+","+c))
                        break;
                    else table.add(r+","+c);
                    r++;
                }
                System.out.println((r+1)+" "+(c+1));
            }
            else if (oneMove=='L') {
                while (c>0) {

                    if (table.contains(r+","+c))
                        break;
                    else table.add(r+","+c);
                    c--;
                }
                System.out.println((r+1)+" "+(c+1));
            }
            else {
                while (c<M-1) {
                    if (table.contains(r+","+c))
                        break;
                    else table.add(r+","+c);
                    c++;
                }
                System.out.println((r+1)+" "+(c+1));
            }
        }

    }

}
