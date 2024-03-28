

public class Concatenation {
    public <A,B,C,D> void add (A a, B b, C c, D d){
        System.out.println(a +" "+ b +" "+ c + "D" + c);
    }

    public <A,B,C> void add (A a, B b, C c) {
        System.out.println(a +" "+ b +" "+ c);
        }

    public <A,B>void add (A a, B b) {
        System.out.println(a +" "+ b);
        }
}
