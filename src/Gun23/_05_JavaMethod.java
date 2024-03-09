package Gun23;

import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        //Kullanıcıdan öğrenci adı ve notlarını (60 70 90) şeklinde
        // 3 öğrenci ve 3 ders notu alınız bunların ortalamasını
        // bir metotda bulduktan sonra sonucu ekrana ismet 75 şeklinde
        // yazdırınız main içerisinde.
        for (int i = 0; i <3; i++) {
        Scanner oku =new Scanner(System.in);
        System.out.print("Ögrenci adini yaziniz= ");
        String isim=oku.nextLine();


        System.out.print("Ögrenci notunu giriniz= ");
        String strNotlar=oku.nextLine();//notlar  45 65  76

            System.out.println("ogrenci= "+ isim);
            System.out.println("ortalamasi= "+ ortalamaBul(strNotlar));



    }

}
public static int ortalamaBul(String notlar)
    {
    int toplam=0;
    String[] notDizi=notlar.split(" ");


        for (int i = 0; i < notDizi.length ; i++) {
            toplam+=Integer.parseInt(notDizi[i]);

        }
        return toplam/notDizi.length;
    }
}