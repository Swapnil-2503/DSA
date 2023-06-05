
import java.util.*;

public class practise1{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
set.add(1);
//size
System.out.println(set.size());

//print all
System.out.println(set);
//remove

Iterator it=set.iterator();
//hasNext Next
while(it.hasNext()){
    System.out.println(it.next());
}

set.remove(1);
System.out.println(set);
        //search
        if(set.contains(1)){
            System.out.println("1 present");
        }
        else System.out.println("1 not present");
        if(set.contains(3)){
            System.out.println("3 is present");
        }
        else System.out.println("3 not present");
    }
}