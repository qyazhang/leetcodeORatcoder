package practice.UnionFIndAndGraph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluationDivision {

  public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
    UnionFind uf = new UnionFind();
    double[] res = new double[queries.size()];
    for (int i=0;i<equations.size();i++)
      uf.union(equations.get(i).get(0), equations.get(i).get(1), values[i]);

    for (String name: uf.parents.keySet()){
      String key = name.toString();
      String value = uf.parents.get(name).toString();
      System.out.println(key + " " + value);
    }

    for (int i=0;i<equations.size();i++) {
      String x = equations.get(i).get(0), y = equations.get(i).get(0);
      res[i] = (uf.parents.containsKey(x) && uf.parents.containsKey(y) && uf.find(x) == uf.find(y)) ? uf.vals.get(x) / uf.vals.get(y) : -1.0;
    }
    return res;
  }


  public static class UnionFind {
    Map<String, String> parents;
    Map<String, Double> vals;

    UnionFind() {
      parents = new HashMap<>();
      vals = new HashMap<>();
    }

    public void add(String x) {
      if (parents.containsKey(x)) return;
      parents.put(x, x);
      vals.put(x, 1.0);
    }

    public String find(String x) {
      String p = parents.getOrDefault(x, x);
      if (x != p) {
        String pp = find(p);
        vals.put(x, vals.get(x) * vals.get(p));
        parents.put(x, pp);
      }
      return parents.getOrDefault(x, x);
    }

    public void union(String x, String y, double v) {
      add(x);
      add(y);
      String px = find(x), py = find(y);
      parents.put(px, py);
      vals.put(px, v * vals.get(y) / vals.get(x));
    }

  }



}


