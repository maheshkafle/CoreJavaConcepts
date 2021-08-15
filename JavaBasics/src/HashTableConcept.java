import java.util.Hashtable;

public class HashTableConcept {

    public static void main(String[] args) {

        // Interview Question: WHat are the difference between ArrayList and HashTable
        // This kind of HashTable can store any datatype key and value pair
        Hashtable h1 = new Hashtable();

        h1.put("A", "Small");
        h1.put("B","world");
        h1.put(0,100);
        System.out.println("B: "+h1.get("B"));
        h1.remove("B");
        System.out.println("B: "+h1.get("B"));
        System.out.println("size: "+h1.size());

        // Restricting HashTable to store only specific Data Type
        Hashtable<Integer,Integer> h2 = new Hashtable<Integer, Integer>();
        h2.put(0, 100);
        h2.put(1,200);

        Hashtable<String,String> h3 = new Hashtable<String, String>();
        h3.put("A", "Hello");
        h3.put("B","World!");

    }
}
