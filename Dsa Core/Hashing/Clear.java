import java.util.*;

public class Clear {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        // Clearing the HashMap
        hashMap.clear();
        System.out.println("After clearing, HashMap is empty: " + hashMap.isEmpty()); // Output: After clearing, HashMap is empty: true
    }
}
