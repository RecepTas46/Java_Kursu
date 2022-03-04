package Gun07;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan boy(ondalıklı) ve kilosunu(ondalıklı) bilgisini
        // alıp ekrana tek satırda yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Boyunuz=");

        double boy= oku.nextDouble();
        System.out.print("kilonuz=");
        double kilo= oku.nextByte();
        System.out.println("boy="+boy +   "kilo="+kilo);



    }
}
