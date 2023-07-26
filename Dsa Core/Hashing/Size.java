import java.util.*;
public class Size {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Size of the HashMap
        System.out.println("Size of the HashMap: " + hashMap.size()); // Output: Size of the HashMap: 3
    }
}