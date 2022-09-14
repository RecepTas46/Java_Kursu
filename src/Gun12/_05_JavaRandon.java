package Gun12;

public class _05_JavaRandon {
    public static void main(String[] args) {

        //soru:0 ile 6 arasinda sayi ureten program yaziniz
// Math.rondon() --->>0,0000 - 0,99999 arasi sayi üretir
        double doublesayi=Math.random() * 10;// 0-9 sayi veriyor
        int tamSayi=(int) doublesayi;//0-9 arasi it sayi
        System.out.println("tamSayi=(0-10)=" + tamSayi);

        tamSayi= (int)(Math.random() * 6);//0-5 arasi int sayiya dönustu
        System.out.println("tamSayi=(0-6)" + tamSayi);

    }
}
