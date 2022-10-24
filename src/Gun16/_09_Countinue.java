package Gun16;

import java.util.Scanner;

public class _09_Countinue {
    public static void main(String[] args) {

        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.
        Scanner oku = new Scanner(System.in);


int toplam=0;
        for (int i=1;i<=5 ;i++)
        {

            System.out.println("bir sayi yaziniz=");
            int sayi= oku.nextInt();
            if (sayi>5&&sayi<10)
            {
                System.out.println("girdiginiz sayi 5 ile 10 arasinda 0ldugundan toplanmayacak");
                continue;
            }
            toplam=toplam+sayi;

        }
        System.out.println("toplam = " + toplam);

        }

    }

// sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
// DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.