package Gun09;

public class _06_StringReplace {
    public static void main(String[] args) {

        // Replace : bir stringin içerisindeki istenen karakter(lerin) hepsini,
        // verilen yenisi ile değiştirir.

        String text="Merhaba Dünya Güzeli 123";

        System.out.println("orjinal hali= " + text);
        System.out.println("a ların e olarak deişmiş hali = " + text.replace("a", "e")); //Merhebe Dünye Güzeli
        System.out.println("ba -> de = " + text.replace("ba", "de")); //Merhade Dünya Güzeli
        System.out.println("Dünya -> Java = " + text.replace("Dünya", "Java")); //Merhaba Java Güzeli
        System.out.println("a ların silebilirsiniz = " + text.replace("a", "")); //Merhb Düny Güzeli
        System.out.println("Merhaba--->Sevgili = " +text.replace("Merhaba","Sevgili") );// Sevgili Dünya Güzeli
        System.out.println("Güzeli----> ="+ text.replace("Güzeli", ""));//Merhaba Dünya 
        System.out.println("123 yasin = " + text.replaceAll("[Merhaba Dünya Güzeli]",""));
        System.out.println("123 yazmasin= " + text.replaceAll("[^Merhaba Dünya Güzeli]",""));
    }
}
