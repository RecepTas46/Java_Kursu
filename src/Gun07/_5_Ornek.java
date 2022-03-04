package Gun07;

import java.util.Scanner;

public class _5_Ornek {

    public static void main(String[] args) {

        // Kullanıcıdan Adını ve soyadını ayrı ayrı okutarak alıp
        // birlikte ekrana yazdırnız.

        Scanner oku=new Scanner(System.in);
        System.out.println("kullanicinin adini birlikte ekrana yazdiriniz");
        String adi= oku.next();
        String soyadi= oku.next();
        System.out.println("adi:"+adi);
        System.out.println("soyadi="+soyadi);

        String adisoyadi=oku.nextLine();

        System.out.println("adisoyadi="+adisoyadi);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        System.out.print("Lütfen adınızı giriniz=");
        String ad = oku.nextLine();

        System.out.print("Lütfen soyadınızı giriniz=");
        String soyad = oku.nextLine();

        System.out.println("Adınız ve Soyadınız = " + ad+" "+soyad);

    }}
