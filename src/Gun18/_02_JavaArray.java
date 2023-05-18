package Gun18;

public class _02_JavaArray {
    public static void main(String[] args) {
        int sayi;// 1 tane sayi saklayabiliyor
        int[] dizi1 = new  int[5];//0,1,2,3,4 indexli 5 adet sayilik yer actik

        System.out.println("dizi1.length = " +dizi1.length);

        for (int i = 0; i < dizi1.length; i++)
        {
            System.out.println("Dizi nin "+i+".Elamani="+dizi1[i]);
        }
        System.out.println("dizi1[4] ="+dizi1[4]);// 1 tane elaman icin ornegin4.elamani bu sekilde
        //yazdirabiliriz. 4.indexe göre aslinda adet acisindan 5.elamandir.


    }
}
