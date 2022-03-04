package Gun07;

import java.util.Scanner;

public class _02_JavaScanner {
    public static void main(String[] args) {


         Scanner oku = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= oku.nextInt();
        System.out.println("girilen sayi:"+sayi);
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir kelime giriniz: ");
        String kelime=scanner.nextLine();
        System.out.println("kelime = " + kelime);
    }
}
