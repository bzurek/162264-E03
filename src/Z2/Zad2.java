package Z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Zad2 {
    public static <T extends Object> void DeleteOneBeforeLast(LinkedHashSet<T> linkedHashSet){
        Iterator it = linkedHashSet.iterator();
        Iterator it2 = linkedHashSet.iterator();
        if(it.hasNext())
        {
            it.next();
        }
        while(it.hasNext())
        {
            it.next();
            it2.next();
            if(!it.hasNext())
            {
                it2.remove();
            }
        }
    }

    public static void main(String[] args) {
        LinkedHashSet<Integer> LinkedHashSet1 = new LinkedHashSet<>(Arrays.asList(1,2,3,4,5));
        LinkedHashSet<String> LinkedHashSet2 = new LinkedHashSet<>(Arrays.asList("a","b","c","d","e"));
        LinkedHashSet<Double> LinkedHashSet3= new LinkedHashSet<>(Arrays.asList(1.1,2.2,3.3,4.4,5.5));
        System.out.println(LinkedHashSet1);
        System.out.println(LinkedHashSet2);
        System.out.println(LinkedHashSet3);
        System.out.println("Usuwanie przedostatniego");
        DeleteOneBeforeLast(LinkedHashSet1);
        DeleteOneBeforeLast(LinkedHashSet2);
        DeleteOneBeforeLast(LinkedHashSet3);
        System.out.println(LinkedHashSet1);
        System.out.println(LinkedHashSet2);
        System.out.println(LinkedHashSet3);
    }
}
