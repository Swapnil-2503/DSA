
import java.util.HashMap;
public class Iterating {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Iterating over the HashMap using keySet()
        System.out.println("Iterating over the HashMap:");
        for (Integer key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}