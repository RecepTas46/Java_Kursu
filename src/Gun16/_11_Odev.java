package Gun16;

import java.util.Scanner;

public class _11_Odev {
    public static void main(String[] args) {
// Kullanıcıdan 6 adet sayı isteyiniz
        // Bu sayılardan 7 ile 12 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        Scanner oku =new Scanner(System.in);


        int toplam=0;
        for (int i=1;i<=5;i++)
        {
            System.out.println(" sayi giriniz");
            int sayi=oku.nextInt();
            if (sayi>7&& sayi<12)
            {

                System.out.println(" 7 ile 12 arasindaki sayilari toplama ");
                continue;
            }
            toplam=toplam+sayi;

        }
        System.out.println("toplam = " + toplam);
    }
}
