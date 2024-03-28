import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashet {
    Set<String> names = new LinkedHashSet<>();

    public LinkedHashet(){
        names.add("Darmawan");
        names.add("Kaka");
        names.add("Prajadiputra");
    }

    public void getInfo(){
        for(String name : names){
            System.out.println(name);
        }
    }
}
