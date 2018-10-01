//
//package AtcoderContest0908;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class test4 {
//
//  public static void main(String[] args) throws FileNotFoundException {
//
//
//    Scanner cin = new Scanner(new FileReader("input.txt"));
////    Scsanner cin = new Scanner(System.in);
//
//    int h = cin.nextInt();
//    int w = cin.nextInt();
//
//    int[][] map = new int[h][w];
//    int[][] used = new int[h][w];
//
//    for (int i = 0; i < h; i++) {
//      for (int j = 0; j < w; j++) {
//        map[i][j] = cin.nextInt();
//        used[i][j] = 0;
//      }
//    }
//
//    Queue<String> queue = new LinkedList<>();
//    int moveCount = 0;
//
//    for (int y = 0; y < h; y++) {
//      int sx, gx, dx;
//      if (y % 2 == 0) {
//        sx = 0;
//        gx = w;
//        dx = 1;
//      } else {
//        sx = w - 1;
//        gx = -1;
//        dx = -1;
//      }
//      for (int x = sx; x != gx; x += dx) {
//        if (map[y][x] % 2 == 1 || !pos.isEmpty()) {
//          pos.add(new int[]{y + 1, x + 1});
//        }
//        if (map[y][x] % 2 == 1) {
//          if (pos.size() != 1) {
//            for (int i = 1; i < pos.size(); i++) {
//              ans.add(new int[]{pos.get(i - 1)[0], pos.get(i - 1)[1], pos.get(i)[0], pos.get(i)[1]});
//            }
//            pos.clear();
//          }
//        }
//      }
//    }
//
//    System.out.println(queue.size());
//    while (!queue.isEmpty()) {
//      System.out.println(queue.poll());
//    }
//
//  }
//
//
//}
