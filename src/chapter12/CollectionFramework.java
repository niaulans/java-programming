package chapter12;

import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {

        // Set
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println("-----------");

        // List
        List fruit2 = new ArrayList();
        fruit2.add("apple");
        fruit2.add("lemon");
        fruit2.add("banana");
        fruit2.add("orange");
        fruit2.add("lemon");

        System.out.println(fruit2.get(2));
        System.out.println(fruit2.size());
        System.out.println(fruit2);
        System.out.println("-----------");

        // Queue
        Queue fruit3 = new LinkedList();
        fruit3.add("apple");
        fruit3.add("lemon");
        fruit3.add("banana");
        fruit3.add("orange");
        fruit3.add("lemon");

        System.out.println(fruit3.size());
        System.out.println(fruit3);
        fruit3.remove();
        System.out.println(fruit3);
        System.out.println(fruit3.peek());
        System.out.println("-----------");

        // Map
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);

        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories);

        System.out.println(fruitCalories.get("lemon"));
        System.out.println(fruitCalories.entrySet());

        fruitCalories.remove("orange");
        System.out.println(fruitCalories);


    }
}
