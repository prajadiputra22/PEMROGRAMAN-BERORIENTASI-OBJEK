public class Jms {
    public static void main(String[] args) {
        String text = "My name is Darmawan Suka Prajadiputra";
        System.out.println("Text : " + text);
        
        System.out.println("\n1. Length()");
        System.out.println("Panjang string: " + text.length());
        
        System.out.println("\n2. Substring()");
        System.out.println("Substring dari indeks: " + text.substring(0, 6));
        
        System.out.println("\n3. CharAt()");
        System.out.println("Karakter pada indeks 5: " + text.charAt(4));
        
        System.out.println("\n4. to Lowercase() & Uppercase()");
        System.out.println("Text asli: " + text);
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Uppercase: " + text.toUpperCase());
        
        System.out.println("\n5. Replace()");
        System.out.println("Mengganti 'Suka' menjadi 'Like': " + text.replace("Suka", "Like"));
        
        System.out.println("\n6. Contains()");
        System.out.println("Apakah mengandung kata 'Darmawan'? " + text.contains("Darmawan"));
        System.out.println("Apakah mengandung kata 'Kaka'? " + text.contains("Kaka"));
        
        System.out.println("\n7. Equals()");
        String text2 = "My name is Darmawan Suka Prajadiputra";
        String text3 = "My name is Darmawan Suka Prajadiputra";

        System.out.println("Apakah sama dengan text 2? " + text.equals(text2));
        System.out.println("Apakah sama dengan text 3? "+ text.equals(text3));
        
        System.out.println("\n8. equalsIgnoreCase()");
        String upperText = "MY NAME DARMAWAN SUKA PRAJADIPUTRA";
        System.out.println("Apakah sama dengan upperText? " + text.equalsIgnoreCase(upperText));
        
        System.out.println("\n10. EndsWith()");
        System.out.println("Apakah diakhiri dengan 'Prajadiputra'? " + text.endsWith("Prajadiputra"));
        System.out.println("Apakah diakhiri dengan 'ra'? " + text.endsWith("ra"));
        System.out.println("Apakah diakhiri dengan 'a'? " + text.endsWith("a"));
    }
}
