package Gun05;

public class _03_Ornek1 {
    public static void main(String[] args) {
        //Bir dikdortgenin iki kenari icin uzunkuk tanimlayiniz
        //cevre ve alanini bulunuz


        int kisaKenar=10;
        int uzunKenar=15;

        int cevre = kisaKenar + kisaKenar + uzunKenar + uzunKenar;
        int alan = kisaKenar * uzunKenar;

        System.out.println("cevre=" + cevre+"cm");
        System.out.println("alan=" + alan + "cm");
    }
}
