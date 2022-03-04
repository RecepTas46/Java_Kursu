package Gun06;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        // byte -> short -> char -> int -> long -> float -> double ; otomatik dönüşüm
        double oran= 3.2;
        int sayi=5;

        sayi = (int)oran; // double tipindeki 3.2 değeri int tipine atıldı.
        // bu tip dönüşümüne daraltma yönünde olduğu için  Narrowing Casting denir.
        // diğer adıyla extra işlem yapıldığından manuel dönüşüm de denir.

        System.out.println("sayi = " + sayi); // sayi=3  veri kaybı oldu.
    }
}
