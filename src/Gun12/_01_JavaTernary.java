package Gun12;

import java.util.Scanner;

public class _01_JavaTernary {
    public static void main(String[] args) {

        //// Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        //        // tek ise "tek" atayınız ve ekrana stringi yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("sayi=");
        int sayi= oku.nextInt();

        String text="";
//klasik yöntem
        if (sayi % 2== 0)

        text="cift";

        else

            text="tek";
//ternary yöntemi
        text=(sayi%2==0) ? "cift" : "tek";
        System.out.println("text= " +text);
        //3.yöntem direk yazdir
        System.out.println("islem sonucu=" +((sayi%2==0) ? "cift" : "tek"));



    }
}
