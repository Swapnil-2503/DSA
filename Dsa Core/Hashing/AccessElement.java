import java.util.HashMap;
public class AccessElement {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        // Accessing elements using keys
        String value = hashMap.get(2);
        System.out.println("Value associated with key 2: " + value); // Output: Value associated with key 2: Two
    }
}
