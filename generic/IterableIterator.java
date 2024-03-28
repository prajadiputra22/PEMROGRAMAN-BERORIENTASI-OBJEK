

import java.util.Arrays;
import java.util.Iterator;

public class IterableIterator {
    Iterable<String> names = Arrays.asList("Eko", "Kurniawan", "Khannedy");

    Iterator<String> iterator = names.iterator();

    public void getName(){
        while(iterator.hasNext())
        {
            String name = iterator.next();
            System.out.println(name);
        }
    }

    // public void setNames(){
    //     for (String name : names){
    //         System.out.println(name);
    //     }
    // }
}
