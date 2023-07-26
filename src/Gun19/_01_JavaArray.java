package Gun19;

import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {
        //kullanicini girecegi bir cümle de kac kelime oldugunu bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.println("Bir cümle giriniz= ");
        String cumle=oku.nextLine();

         int kelimeSayisi=0;
        for (int i = 0; i <cumle.length(); i++)
             if (cumle.charAt(i) == ' ')
                kelimeSayisi++;

            System.out.println("kelimeSayisi = " +  (kelimeSayisi +1));
//etkilenecek sadece bir satir ise paranteze gerek yok.


    }
}
