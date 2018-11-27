package Atcoder;

public class template {

  static class P implements Comparable<P> {
    int idx;
    int p;
    int y;


    public P(int idx, int p, int y) {
      super();
      this.idx = idx;
      this.p = p;
      this.y = y;
    }


    @Override
    public String toString() {
      return "P [idx=" + idx + ", p=" + p + ", y=" + y + "]";
    }


    @Override
    public int compareTo(P o) {
      return Integer.compare(this.y, o.y);
    }

  }

}
