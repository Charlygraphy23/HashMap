package HashMap_Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Comapre_samekey {

    public static void main(String[] args) {

        HashMap<Integer,String > map=new HashMap<>();
        map.put(1," Aabir");
        map.put(2," Babua");
        map.put(3," Cat");            // getting values of hashmap 1

        HashMap<Integer,String > map1=new HashMap<>();
        map1.put(2," Babua");
        map1.put(4," Eat");
        map1.put(1," Aabir");           // getting values of hashmap 2


        ArrayList<Integer> arrayList1=new ArrayList<>();
        ArrayList<Integer> arrayList2=new ArrayList<>();




        arrayList1.addAll(map.keySet());
        arrayList2.addAll(map1.keySet());
        System.out.println(arrayList1);
        System.out.println(arrayList2);

        for (var i=0;i<3;i++){
            if(arrayList1.get(i).equals(arrayList2.get(i))){
                System.out.println((i+1)+" values "+ map1.get(i+1));

            }
        }


    }
}
