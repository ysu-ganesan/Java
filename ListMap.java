
import java.util.*;

class topics {

    int a = 10;

    protected void Arraylist() {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("sam");
        obj.add("Shakeen");
        obj.add("Sanjay");
        obj.add("Sriram");
        System.out.println(obj);
        obj.set(2, "Kumar");
        System.out.println(obj);
        System.out.println("After removing Sriram");
        obj.remove(3);
        System.out.println(obj);
        System.out.println(obj.get(0));
        System.out.println(obj.contains("sam"));
        System.out.println(obj.size());
        obj.clear();
        System.out.println(obj);

    }

    public void Map() {
        Map<String, String> maps = new HashMap<>();

        maps.put("Sam", "a+");
        maps.put("Sanjay", "a");
        maps.put("Shakeen", "o");
        maps.put("Sriram", "b+");

        // replace value
        maps.replace("Sam", "o");

        // 🔹 getOrDefault
        System.out.println("Get Sam's grade: " + maps.getOrDefault("Sam", "Not Found"));
        System.out.println("Get Rahul's grade: " + maps.getOrDefault("Rahul", "Not Found"));
        System.out.println(maps);
        // 🔹 putIfAbsent
        maps.putIfAbsent("Sam", "a");       // will NOT change (already exists)
        maps.putIfAbsent("Rahul", "b");     // will be added (not present)

        System.out.println("------------------");

        // print keys
        System.out.println("Keys: " + maps.keySet());

        // contains checks
        System.out.println("Contains key 'Sanjay'? " + maps.containsKey("Sanjay"));
        System.out.println("Contains value 'a'? " + maps.containsValue("a"));

        System.out.println("------------------");

        // for-each loop
        for (Map.Entry<String, String> n : maps.entrySet()) {
            System.out.println("Name : " + n.getKey() + " | Grade : " + n.getValue());
        }
    }

    public static void Linkedlisteg() {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("sam");
        obj.add("Shakeen");
        obj.add("Sanjay");
        obj.add("Sriram");
        obj.set(2, "Sanjay Kumar");
        System.out.println(obj);
        System.out.println("After removing Sriram");
        obj.remove(3);
        System.out.println(obj);
        System.out.println("Insert at beginning:");
        obj.addFirst("Start");
        System.out.println(obj);
        System.out.println("Insert at end:");
        obj.addLast("End");
        System.out.println(obj);

    }

    public static void Hashset() {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(100);
        set.add(78);
        set.add(72);
        set.add(7);
        System.out.println(set);

    }

    public void TreeMapEg() {
        Map<String, String> maps = new TreeMap<>();
        maps.put("Sam", "a+");
        maps.put("Sanjay", "a");
        maps.put("Ajay", "a");
        maps.put("Bsrath", "b+");
        maps.put("Shakeen", "o");
        maps.put("Sriram", "b+");
        maps.replace("Sam", "o");
        System.out.println(maps);


        //only for printing
        maps.forEach((key, value)
                -> System.out.println(key + " -> " + value)
        );

    }

}

public class ListMap {

    public static void TreeSetEg() {
        TreeSet<Integer> tree = new TreeSet<>();

        tree.add(10);
        tree.add(9);
        tree.add(8);
        tree.add(7);
        tree.add(6);
        tree.add(5);

        // 1️⃣ Normal sorted order
        System.out.println("Ascending: " + tree);

        // 2️⃣ Descending order
        System.out.println("Descending: " + tree.descendingSet());

        // 3️⃣ First & Last
        System.out.println("First (smallest): " + tree.first());
        System.out.println("Last (largest): " + tree.last());

        // 4️⃣ Higher & Lower
        System.out.println("Higher than 7: " + tree.higher(7));
        System.out.println("Lower than 7: " + tree.lower(7));

        // 5️⃣ Ceiling & Floor
        System.out.println("Ceiling of 7: " + tree.ceiling(7));
        System.out.println("Floor of 7: " + tree.floor(7));

        // 6️⃣ Contains
        System.out.println("Contains 8? " + tree.contains(8));

        // 7️⃣ Size
        System.out.println("Size: " + tree.size());

        // 8️⃣ Remove
        tree.remove(6);
        System.out.println("After removing 6: " + tree);
    }

    public static void main(String[] args) {
        topics t = new topics();
        System.out.println("ArrayList examples:");
        System.out.println();
        t.Arraylist();
        System.out.println("LinkedList examples:");
        topics.Linkedlisteg();
        System.out.println();
        System.out.println("HashSet examples:");
        topics.Hashset();
        System.out.println();
        System.out.println("TreeSet examples:");
        TreeSetEg();
        System.out.println();
        System.out.println("HashMap examples:");
        t.Map();
        System.out.println();
        System.out.println("TreeMap examples:");
        t.TreeMapEg();
        System.out.println();

    }
}
