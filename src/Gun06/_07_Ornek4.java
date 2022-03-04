package Gun06;

public class _07_Ornek4 {
    public static void main(String[] args) {

        // Soru : Short olarak atadığınız değeri stringe çevirerek,
        // ekrana yazdırınız.

        short sayi=345;
        String strSayi = Short.toString(sayi);

        System.out.println("strSayi = " + strSayi);
        System.out.println("Short.toString(sayi) = " + Short.toString(sayi));

        // Soru : sitring olarak atadığınız değeri inte çevirerek,
        // ekrana yazdırınız.

        String deger="345";//int e donustugu icin isleme giriyor yoksa isleme girmiyor

        int yeniDeger=Integer.parseInt(deger);
        System.out.println("yeniDeger = " + yeniDeger);

        int toplam=yeniDeger+sayi;
       // toplam=deger+sayi---->>>kabul etmiyor cunku deger String oldugu icin
        System.out.println("toplam = " + toplam);

    }
}
