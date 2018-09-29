import java.util.Stack;

public class indeed3 {

    private static char[][] mp = new char[55][55];
    private static int[][] fall;
    private static int total = 0;
    private static int step = 0;
    public static void main(String[] args) {
        Stack<Integer> xpos = new Stack<Integer>();
        Stack<Integer> ypos = new Stack<>();

        for (int i=0;i<mp.length;i++){
            for (int j=0;j<mp[0].length;j++){
                if (mp[i][j]=='?'){
                    xpos.add(i);
                    ypos.add(j);
                }
            }
        }

        dfsSearch(xpos, ypos);
        System.out.println((double)total/step);
    }

    public static void dfsSearch(Stack<Integer> xpos, Stack<Integer> ypos){

        if (!xpos.isEmpty()){
            int xposition = xpos.pop();
            int yposition = ypos.pop();
            mp[xposition][yposition] = 'R';
            dfsSearch(xpos, ypos);
            mp[xposition][yposition] = 'C';
            dfsSearch(xpos, ypos);
        }
        else {
            step++;
            countPush();
        }

    }

    public static void countPush(){

        fall = new int[55][55];
        for (int i=0;i<mp.length;i++) {
            for (int j = 0; j < mp[0].length; j++) {

                if (fall[i][j]==0){
                    pushDomino(i,j);
                    total++;
                }

            }
        }

    }

    public static void pushDomino(int i, int j){

        while(i<mp.length&&j < mp[0].length) {
            fall[i][j] = 1;
            if (mp[i][j]=='R') j++;
            else i++;
        }

    }
}
