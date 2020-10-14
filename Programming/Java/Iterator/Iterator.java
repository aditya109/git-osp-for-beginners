public import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by LokEn on 3/28/2016.
 */
public class DemoIterator {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();
        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
//        animals.add("tiger");

        Iterator<String> it = animals.iterator();
        while (it.hasNext()) {
            Collections.sort(animals);          //sorting array
            String value = it.next();
            System.out.println(value);
        }
    }
}class iterator {
    
}
