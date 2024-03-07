package Gun22;

public class _01_JavaMedhod {
    public static void main(String[] args) {

        System.out.println("Merhaba dünya"); // ekrana yazı yazdırır
        System.out.println("Merhaba dünya");
        System.out.println("Merhaba dünya");

        Math.max(5, 6); // daha önce yazılmış biz çağırıp kullanıyoruz
        // aynı bunun gibi bizde böyle metodlar yazabiliriz.
        // mesala ekrana merhaba dünya yazan bir metod yazalım ve onu sürekli çağıralım.

        merhabaYaz(); // fonksiyonu çağırma şekli
        merhabaYaz();
        merhabaYaz();

        sayiVer();
        sayiSiralama();
        ikiSayiSirala();
    } // main in parantezinin bittiği yer
    // veya buraya

    public static void merhabaYaz() // mainle aynı ismini sen ver
    {
        System.out.println("Fonksiyon Merhaba Dünya");
    }

    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için

    public static void sayiVer() {
        int sayi = 0;
        int toplam = 0;

        while (sayi <= 10) {

            toplam = toplam + sayi;
            sayi++;
        }
        System.out.println("toplam = " + toplam);
    }

    public static void sayiSiralama() {

        int sayi = 0;
        while (sayi < 20) {

            System.out.println("sayi = " + sayi);
            sayi++;
        }
    }

    public static void ikiSayiSirala() {

        int sayi1 = 10;
        int sayi2 = 8;
        for (int i = 0; i < 2; i++) {//burasi islemin kac defa yapilacagini soyluyor
            for (int j = 0; j < 2; j++) {//burasi ise her bir islemi kac defa yazacagini soyluyor.

                System.out.println("sayi1 = " + (sayi1 + sayi2));
                sayi1++;
                sayi2--;
            }
        }
    }
}
