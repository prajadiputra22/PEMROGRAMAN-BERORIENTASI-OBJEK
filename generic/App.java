

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa<Integer> mhs1 = new Mahasiswa<Integer>("Budi", 12345);
        Mahasiswa<String> mhs2 = new Mahasiswa<String>("Budi", "12345");
        Mahasiswa<Double> mhs3 = new Mahasiswa<Double>("Budi", 12345.0);
        mhs1.info();
        mhs2.info();
        mhs3.info();

        System.out.println("=====================");
        Concatenation Y = new Concatenation();
        Y.add(1, "Darmawan");
        Y.add(1, "Darmawan", "Prajadiputra");
        System.out.println("=====================");
        
        System.out.println("\n=====================");
        IterableIterator list = new IterableIterator();
        list.getName();
        System.out.println("=====================");

        System.out.println("\n=====================");
        Name Name = new Name();
        Name.getInfo();
        System.out.println("=====================");
        
        System.out.println("\n=====================");
        ListName ListName = new ListName();
        ListName.getInfo();
        System.out.println("=====================");

        System.out.println("\n=====================");
        Hashet HashSet = new Hashet();
        HashSet.getInfo();
        System.out.println("=====================");

        System.out.println("\n=====================");
        LinkedHashet Linked = new LinkedHashet();
        Linked.getInfo();
        System.out.println("=====================");
    }
}
