package CompanyContest;

import java.util.Scanner;

public class indeed1 {

    public static void main(String[] args) {

        //  Scanner cin = new Scanner(System.in);

//            String tempX = cin.nextLine();
//            String tempY = cin.nextLine();
//            String tempZ = cin.nextLine();
        String tempX = "13";
        String tempY = "31";
        String tempZ = "23";
        int X = Integer.parseInt(tempX);
        int Y = Integer.parseInt(tempY);
        int Z = Integer.parseInt(tempZ);
        for (int i =2;i<=10;i++){
            for (int j=2;j<=10;j++){
                int X2 = change(X,i);
                int Y2 = change(Y,j);
                if (X2+Y2==Z)
                    System.out.println(i+" "+j);
            }
        }
    }

    public static int change(int in, int caseNum){
        int res = 0;
        int count = 0;
        while (in!=0){
            int reminder = in%10;
            if (reminder>=caseNum) return -1;
            else {
                res = res + reminder*(int)Math.pow(caseNum, count);
                count++;
            }
            in = in/10;
        }
        return res;

    }
//    public static void main(String[] args) {
//        Scanner cin=new Scanner(System.in);
//        while(cin.hasNext()){
//            String ia = cin.nextLine();
//            String ib = cin.nextLine();
//            for (char a='a';a<='z';a++){
//                for (char b='a';b<='z';b++){
//                    if(changeTwo(a,b,ia,ib)) {
//                        System.out.println("possible");
//                        return;
//                    }
//                }
//            }
//            System.out.println("impossible");
//            return;
//        }
//    }
//
//    public static boolean changeTwo(char a, char b, String ia, String ib){
//        for (int i=0;i<ia.length();i++){
//            if (change(a,b,ia.charAt(i))!=change(a,b,ib.charAt(i))) return false;
//        }
//        return true;
//    }
//
//    public static char change(char a, char b, char t){
////        if (t==a)
////            return a;
////        else return b;
//        return t==a?a:b;
//    }

}
