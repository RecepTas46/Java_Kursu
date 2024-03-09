package Gun23;

public class _04_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=4;
        int s3=4;
        int s4=4;

        int sonuc1= toplam(s1,s2);
        int sonuc2= toplam(s1,s2,s3);
        int sonuc3= toplam(s1,s2,s3,s4);
        int sonuc4=toplam(s1,s2,s3,s4,s2,sonuc2);

        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
        System.out.println("sonuc4 = " + sonuc4);//print ederken yukaridaki int icine ne denirse o islemleri yapiyor
    }

    // gelen kaç sayı olursa olsun hepsini al dizi ismiyle metoda al
    public static int toplam(int... sayilar) {
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam = toplam + sayilar[i];
        }

//        for(int eleman : dizi)  // foreach
//        {
//            toplam+=eleman;
//        }

        return toplam;


    /*
    public static int toplam(int s1,int s2){
        return s1+s2;
    }

    public static int toplam(int s1,int s2, int s3){
        return s1+s2+s3;
    }

    public static int toplam(int s1,int s2, int s3, int s4){
        return s1+s2+s3+s4;
    }
    */

    }
}