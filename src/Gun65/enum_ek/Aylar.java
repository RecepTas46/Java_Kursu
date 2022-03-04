package Gun65.enum_ek;

public enum Aylar {
    OCAK(31, 1, "ocak"),
    SUBAT(31, 2, "subat"),
    MART(31, 3, "mart"),
    NISAN(31, 4, "nisan"),
    MAYIS(31, 5, "mayis"),
    HAZIRAN(31, 6, "haziran"),
    TEMMUZ(31, 7, "temmuz"),
    AGUSTOS(31, 8, "agustos"),
    EYLUL(31, 9, "eylul"),
    EKIM(31, 10, "ekim"),
    KASIM(31, 11, "kasim"),
    ARALIK(31, 12, "aralik");

    private final int gunMiktari;
    private final int ayNo;
    private final String isim;

    public int getGunMiktari() {
        return gunMiktari;
    }

    public int getAyNo() {
        return ayNo;
    }

    public String getIsim() {
        return isim;
    }


    Aylar(int gunMiktari, int ayNo, String isim) {
        this.gunMiktari = gunMiktari;
        this.ayNo = ayNo;
        this.isim = isim;
    }
}
