//import java.util.*;
//public class Main {
////public class test3{
//    public static void main(String[] args) {
//
//        Scanner cin = new Scanner(System.in);
//
//        int minX = Integer.MAX_VALUE;
//        int minY = Integer.MAX_VALUE;
//
//        String tempX = cin.next();
//        String tempY = cin.next();
//        int Z = cin.nextInt();
////            String tempX = "13";
////            String tempY = "31";
////            String tempZ = "23";
////        int Z = Integer.parseInt(tempZ);
//        long X = Long.parseLong(tempX);
//        long Y = Long.parseLong(tempY);
//
//        for (int i =2;i<=10;i++){
//            for (int j=2;j<=10;j++){
//                int X2 = change(X,i);
//                int Y2 = change(Y,j);
//                if (X2+Y2==Z){
//                    //System.out.println(i+" "+j);
//                    if (i<minX){
//                        minX = i;
//                        minY = j;
//                    }
//                    else if (i==minX){
//                        if (j<minY){
//                            minX = i;
//                            minY = j;
//                        }
//                    }
//                }
//
//            }
//        }
//        System.out.println(minX+" "+minY);
//    }
//
//    public static int change(long in, int caseNum){
//        int res = 0;
//        int count = 0;
//        while (in!=0){
//            int reminder = (int)in%10;
//            if (reminder>=caseNum) return -1;
//            else {
//                res = res + reminder*(int)Math.pow(caseNum, count);
//                count++;
//            }
//            in = in/10;
//        }
//        return res;
//
//    }
//}
