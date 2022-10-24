package Gun16;

import java.util.Scanner;

public class _07_forLoop {
    public static void main(String[] args) {
//// Girilen bir stringdeki a harfi sayısını bulunuz.
//        // c harfine sıra gelirse döngüden çıkılsın

        Scanner oku = new Scanner(System.in);
        System.out.println(" cümle yaziniz=");
        String cümle = oku.nextLine();
        int aMiktar = 0;
        for (int i = 0; i < cümle.length(); i++) {
            if (cümle.toLowerCase().charAt(i) == 'a')
                aMiktar++;
            else if (cümle.toLowerCase().charAt(i) == 'c')
                break;
        }
        System.out.println("aMiktar = " + aMiktar);


    }

}

