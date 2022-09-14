package Gun12;

import java.util.Scanner;

public class _06_JavaRandon {
    public static void main(String[] args) {

// Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.println("a ya kadar sayi üret=");
        int kacaKadarRandomSayi= oku.nextInt();
        int uretilenSayi=(int) (Math.random() * kacaKadarRandomSayi);

        System.out.println("Sayi tahmini=");
        int tahmin=oku.nextInt();

        if(uretilenSayi==tahmin)
            System.out.println("Tebrikler");
            else
            System.out.println("Bilemedinki bilemedinki");
            System.out.println("uretilenSayi="+uretilenSayi);
            //2.yöntem
        String sonuc= (uretilenSayi==tahmin) ? "Tebrikler" : "Bilemedin ki bilemedinki";
        System.out.println("sonuc="+sonuc);

        System.out.println("üretilenSayi="+uretilenSayi);

        }
    }

