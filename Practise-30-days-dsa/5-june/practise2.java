import java.util.*;
//key-value key=unique
public class practise2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();


        //Insert
        map.put("India",120);
        map.put("china",240 );
        map.put("us",100);
        map.put("uk",88);
        System.out.println(map);
        map.put("china", 360);
        System.out.println(map);

        //remove
        map.remove("uk");

        //search key or value

        if(map.containsKey("china")) System.out.println("key present");
        else System.out.println("not present");

        System.out.println(map.get("china"));
        System.out.println(map.get("chna"));

        //iterate
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
            System.out.println(e.getClass());
        }

        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
    }
}
