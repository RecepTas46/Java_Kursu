package Gun16;

import java.util.Scanner;

public class _06_forLoop {
    public static void main(String[] args) {
//2 ler carpim taplosunu ,taplo olarak yazdiriniz

        Scanner oku = new Scanner(System.in);
        System.out.println(" 2  ler carpim taplosu=");
        int sayi=oku.nextInt();

     int carpim=2*sayi;
        for (int i=1;i<=10;i++) {


            carpim = 2* i;//+(1*2)
            System.out.println("2x"+ i+"="+carpim);
        }

    }
}
