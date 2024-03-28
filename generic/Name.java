import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays; 

public class Name {
    Collection<String> names = new ArrayList<>();

    public Name() {
        names.add("Eko");
        names.add("Kurniawan");
        names.addAll(Arrays.asList("Udil", "Programan", "Zaman", "Now"));

        names.remove("Kurniawan");
    }

    public void getInfo(){
        for (String name : names){
            System.out.println(name);
        }

        System.out.println(names.contains("Eko"));
        System.out.println(names.contains(Arrays.asList("Kurniawan", "Now")));
        
        System.out.println(names.contains("Kurniawan"));
        System.out.println(names.contains(Arrays.asList("Zaman", "Programer")));
        
        System.out.println(names.contains("Udil"));
        System.out.println(names.contains(Arrays.asList("Udil", "Now")));
    }
}
