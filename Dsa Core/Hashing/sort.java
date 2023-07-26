import java.util.*;

public class sort {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Three");
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        // Sorting keys
        List<Integer> sortedKeys = new ArrayList<>(hashMap.keySet());
        Collections.sort(sortedKeys);
        System.out.println("Sorted keys: " + sortedKeys); // Output: Sorted keys: [1, 2, 3]

        // Sorting values
        List<String> sortedValues = new ArrayList<>(hashMap.values());
        Collections.sort(sortedValues);
        System.out.println("Sorted values: " + sortedValues); // Output: Sorted values: [One, Three, Two]
    }
}