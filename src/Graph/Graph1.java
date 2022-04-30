package Graph;
import java.util.*;
public class Graph1{
    HashMap<Integer,List<Integer>> obj;
    public Graph1() {
        obj = new HashMap<Integer,List<Integer>>();
    }
    public void addedge(int source , int desti , boolean isbidirection) {
        List<Integer> sourceneighbour = obj.getOrDefault(source , new ArrayList<>());
        sourceneighbour.add(desti);
        obj.put(source,sourceneighbour);
        if(isbidirection)
        {
            List<Integer> destineighbour = obj.getOrDefault(desti , new ArrayList<>());
            destineighbour.add(source);
            obj.put(desti,destineighbour);

        }
    }
    public void display() {
        for(Map.Entry<Integer,List<Integer>> entry:obj.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
    }
    public static void main(String[] args){
        Graph1 obj = new Graph1();
        obj.addedge(1,2,true);
        obj.addedge(1,4,true);
        obj.addedge(2,3,true);
        obj.addedge(3,4,true);
        obj.addedge(3,5,true);
        obj.addedge(5,6,true);
        System.out.println("entries of graph are :");
        obj.display();
    }
}
