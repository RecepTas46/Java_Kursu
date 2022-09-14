package Gun12;

import java.util.Scanner;

public class _02_JavaTernary {
    public static void main(String[] args) {
//soru: girilen sayi 50 den buyuk ise 1,degilse 0 degerini ekrana yaziniz.
        //Ternary operatör ile yapiniz

        Scanner oku=new Scanner(System.in);
        System.out.println("sonucu yazdir=");
        int sayi= oku.nextInt();
        int sonuc =(sayi>50 ? 1 : 0);

        System.out.println("sonuc="+sonuc);
        //2.yöntem
        System.out.println("sonuc="+ (sayi>50 ? 1 :0));


    }
}
