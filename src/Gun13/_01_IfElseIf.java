package Gun13;

import java.util.Scanner;

public class _01_IfElseIf {
    public static void main(String[] args) {
// Bir otopark ücret hesaplama programı yapılmak isteniyor.
        // 0-2 saat ara 5 €, 2-5 arası 10 € , 5 saatten sonra 15 € olarak
        // saat girildiğinde ücreti yazdırınız.

        Scanner oku =new Scanner(System.in);
        System.out.println("saat giriniz=");
        int saat= oku.nextInt();

        if (saat<=2);
            System.out.println("5 €");
        if (saat>5);


        else
            System.out.println("10");
        if (saat<=5);
        else
        System.out.println("15 € ");
        //2. ve tercih edilen yöntem
        if (saat<=2);
        System.out.println("5€");
        if (saat>5);

        if (saat>2 && saat <=5);
        System.out.println("10 €");
        System.out.println("15 e");

        //tranery yöntemi
        String ucret=saat<=2 ? "5 €":(saat<=5 ? "10 €":"15€");
        System.out.println("ucret="+ucret);



    }
}
