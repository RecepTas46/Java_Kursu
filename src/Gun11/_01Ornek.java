package Gun11;

import java.util.Scanner;

public class _01Ornek {
    public static void main(String[] args) {
        //// Ben buraya neden geldim ?
        //        // Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz
        //        // ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        //        // bütünlemeye kaldınız şeklinde yazdırınız.
Scanner scanner=new Scanner(System.in);
        System.out.println("vize notunu giriniz: ");
        int vizeNotu=scanner.nextInt();

        System.out.println("final notunu giriniz: ");
        int finalNotu=scanner.nextInt();

        double ortalamaNot=(vizeNotu*0.4 + finalNotu*0.6);
        System.out.println("ortalamaNot = " + ortalamaNot);

        if (ortalamaNot>60)
        {
            System.out.println("Gectiniz, Tebrikler");
        }else System.out.println("Butunlemeye kaldiniz");

    }
}
