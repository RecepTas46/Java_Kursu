package Gun05;

public class _06_JavaString {
    public static void main(String[] args) {

        int sayi = 5;
        String ad = "ismet";
        String soyad ="temur";

        System.out.println(ad);
        System.out.println("ad");

        // int toplam=a+b;
        String fullName="ad"+ "soyad";
        System.out.println("fullName = " + fullName); // -> fullName = adsoyad

        fullName=ad+" "+soyad;
        System.out.println("fullName = " + fullName); // -> fullName = ismettemur


        int yas=45;
        int kilo=72;
        String bilgi=ad+" "+soyad+" "+ yas +" "+kilo;
        System.out.println("bilgi = " + bilgi); // -> ismet temur 45 72
        // toplama işleminde eğer bir tane bile string değişken varsa hepsi string kabul edilir sadece işlemde.

        bilgi=ad+" "+soyad+" yas="+ yas +" kilo="+kilo;
        System.out.println("bilgi = " + bilgi); // -> ismet temur yas=45 kilo=72

        bilgi=ad+" "+soyad+" "+ (yas +kilo); // bilgisayar önce parantezin için yapar yani sayısal toplar
        System.out.println("bilgi = " + bilgi); // -> ismet temur 117






    }
}
