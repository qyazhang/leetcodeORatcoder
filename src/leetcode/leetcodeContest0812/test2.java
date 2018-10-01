package leetcode.leetcodeContest0812;

public class test2 {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4};

        System.out.println();
    }

    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] res= new int[R*C][2];
        res[0]=new int[]{r0, c0};
        int len=0, idx=1, k=0;
        int[] d= new int[]{0,1,0,-1,0};
        while (idx<R*C){
            len++;
            for (int round=0; round<2; round++){ //这里是同一长度，走两圈。注意看图
                for (int sz=len; sz>0; sz--){
                    r0+=d[k];
                    c0+=d[k+1];
                    if (r0<0 || r0>=R || c0<0 || c0>=C) continue;
                    if (idx>=R*C) break;
                    res[idx++]=new int[]{r0, c0};
                }
                k=(k+1)%4;
            }
        }
        return res;
    }


}
