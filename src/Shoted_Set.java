package HashMap_Example;

import java.util.HashMap;
import java.util.TreeSet;

public class Shoted_Set {


    public static void main(String[] args) {

        HashMap<Integer,String > map=new HashMap<>();
        map.put(1," Aabir");
        map.put(2," Babua");
        map.put(3," Cat");            // getting values of hashmap 1

        HashMap<Integer,String > map1=new HashMap<>();
        map1.put(2," Babua");
        map1.put(4," Eat");
        map1.put(1," Aabir");           // getting values of hashmap 2


        TreeSet<String> treeSet1=new TreeSet<>();
        TreeSet<String> treeSet2=new TreeSet<>();


        treeSet1.addAll(map.values());
        treeSet2.addAll(map1.values());
        System.out.println(treeSet1);
        System.out.println(treeSet2);




    }

}
