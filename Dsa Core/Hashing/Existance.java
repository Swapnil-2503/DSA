import java.util.HashMap;
public class Existance {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        int keyToCheck = 3;
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists in the HashMap.");
        } else {
            System.out.println("Key " + keyToCheck + " does not exist in the HashMap.");
        }

        String valueToCheck = "Three";
        if (hashMap.containsValue(valueToCheck)) {
            System.out.println("Value " + valueToCheck + " exists in the HashMap.");
        } else {
            System.out.println("Value " + valueToCheck + " does not exist in the HashMap.");
        }
    }
}
