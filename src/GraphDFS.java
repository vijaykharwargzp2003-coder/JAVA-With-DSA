import java.util.*;
public class GraphDFS {
    private int v;
    private List<List<Integer>> adj;
    public GraphDFS(int v){
        this.v=v;
        adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
    }
    public void  addEdge(int u,int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
