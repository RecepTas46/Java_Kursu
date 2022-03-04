package Gun06;

public class _09_Ornek6 {
    public static void main(String[] args) {

        //Soru 1: String olarak verilen karenin 1 kenar uzunluğundan
        // karenin çevresinin uzunluğunu bulunuz.

        String kenar="8";

        int intKenar= Integer.parseInt(kenar);

        //int cevre = intKenar + intKenar + intKenar +intKenar ;
        int cevre=intKenar*4;

        System.out.println("cevre = " + cevre);
        int alan=intKenar*intKenar;
        System.out.println("alan = " + alan);

        // Soru 2:String olarak verilen dikdortgenin  1 kenar uzunluğu 10 diger kenari 15
        // dikdortgenin çevresinin uzunluğunu bulunuz.

        String uzunKenar="15";
        String kisaKenar="10";

        int uKenar=Integer.parseInt(uzunKenar);
        int kKenar=Integer.parseInt(kisaKenar);

        int dikdortgenCevre=2*(uKenar+kKenar);
        System.out.println("dikdortgenCevre = " + dikdortgenCevre);
        int dikdortgenAlan=uKenar*kKenar;
        System.out.println("dikdortgenAlan= " + dikdortgenAlan);

    }
}
