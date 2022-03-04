package Gun04;

public class _03_EscapeChracter {
    public static void main(String[] args) {

        // \n -> yeni satir aciyor
        // \t -> Tab tusuna basilmis gibi etki yapar
        // \b ->BackSpace basilmis gibi bir karekter siler
        // \" -> cift tirnak koyar
        // \\ -> \ isareti koyar
        // \r -> Kendinden önceki karekterleri satir basina kadar siler

        System.out.println("Merhaba Dünya"); //Merhaba Dünya
        System.out.println("Merhaba \n Dünya"); //Merhaba
        //Dünya
        System.out.println("Merhaba \t Dünya"); //Merhaba 	 Dünya
        System.out.println("Merhaba\bDünya"); //MerhabDünya
        System.out.println("Merhaba\"Dünya");//Merhaba"Dünya
        System.out.println("Merhaba\\Dünya"); //Merhaba\Dünya
        System.out.println("Merhaba\rDünya"); //Dünya
        System.out.println("Merhaba \"Dünya\""); //Merhaba "Dünya" -> ikisi arasina tirnak koyar

        }
}
