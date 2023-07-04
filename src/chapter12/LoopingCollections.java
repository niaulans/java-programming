package chapter12;

import java.util.*;

public class LoopingCollections {

    public static void main(String[] args) {
//        setDemo();
//        mapDemo();
//        listDemo();
        queueDemo();
    }

    public static void setDemo() {
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        // Method 1
        var i = fruit.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("-------");

        // Method 2
        for(String item: fruit) {
            System.out.println(item);
        }
        System.out.println("-------");

        // Method 3
        fruit.forEach(x -> System.out.println(x));
        System.out.println("-------");

        // Method 4
        fruit.forEach(System.out::println);
    }

    public static void listDemo() {
        List<String> fruit2 = new ArrayList();
        fruit2.add("apple");
        fruit2.add("lemon");
        fruit2.add("banana");
        fruit2.add("orange");
        fruit2.add("lemon");

        for(String item: fruit2){
            System.out.println(item);
        }
    }

    public static void queueDemo() {
        Queue<String> fruit3 = new LinkedList();
        fruit3.add("apple");
        fruit3.add("lemon");
        fruit3.add("banana");
        fruit3.add("orange");
        fruit3.add("lemon");

        for(String item: fruit3) {
            System.out.println(item);
        }
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);


        // Method 1
        for(var entry: fruitCalories.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("---------------------");

        // Method 2
        fruitCalories.forEach((k, v) -> System.out.println("Fruit: " + k + ", " + "calories "+ v));
    }
}
