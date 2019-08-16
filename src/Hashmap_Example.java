package HashMap_Example;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap_Example {
    public static void main(String[] args) {

        HashMap<Integer, String> map=new HashMap<>();

        System.out.println("Enter no. of Elements");
        var scanner=new Scanner(System.in);
        var size=scanner.nextInt();

        for(var i=1;i<=size;i++){

            System.out.println(" Enter Key(Integer) - Value(Strings) ");
            var key=scanner.nextInt();
            var value=scanner.next();
            map.put(key,value);

        }

        System.out.println("-----------------");
        System.out.println("List Of Values");
        System.out.println(map.entrySet());


    }
}
