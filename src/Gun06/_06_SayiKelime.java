package Gun06;

public class _06_SayiKelime {
    public static void main(String[] args) {

        String girilenKelime = "65"; // şu haliyle ahmet gibi bir kelimedir.sayısal işleme giremez
        int girilenSayi=65;

        // kelimenin -> sayıya çevrilmesi
        int girilenKelimeninSayiHali = Integer.parseInt(girilenKelime); // dönüşecek tipe uygun dönüşüm
        short shortDeger = Short.parseShort(girilenKelime);
        double oran = Double.parseDouble(girilenKelime);

        // sayinin -> kelimeye çevrilmesi
        String girilenSayininKelimeHali = Integer.toString(girilenSayi); // değişkenin tipine uygun dönüşüm
        String kelimeOran = Double.toString(oran);
        System.out.println("kelimeOran = " + kelimeOran);

        String kelimeDeger=Short.toString(shortDeger);
        System.out.println("kelimeDeger = " + kelimeDeger);


    }
}
