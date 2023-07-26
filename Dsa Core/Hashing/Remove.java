import java.util.*;

public class Remove {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        // Removing an element from the HashMap
        int keyToRemove = 2;
        hashMap.remove(keyToRemove);
        System.out.println("After removing key " + keyToRemove + ": " + hashMap);
    }
}