package Java;

import java.util.*;

public class Coll {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3, "three");
        List<Map.Entry<Integer,String>> list = new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
        list.add(0, Map.entry(0,"zero"));

        //list.forEach((e)-> System.out.println(e.getValue().equals("zero")? true:false));

        Collections.sort(list,
            new Comparator<Map.Entry<Integer,String>>() {
                public int compare(Map.Entry<Integer,String> a,Map.Entry<Integer,String> b){
                    return a.getValue().compareTo(b.getValue());
                }
            }
        );
        System.out.println(list.stream().filter(x->x.getValue().equals("zero")).count()>0);
        map.forEach((k,v)->System.out.println(k+" "+v));
        System.out.println();
        list.forEach((e)->System.out.println(e.getKey()+" "+e.getValue()));
    }
}