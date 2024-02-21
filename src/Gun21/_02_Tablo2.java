package Gun21;

public class _02_Tablo2 {
    public static void main(String[] args) {

//  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et
        int[][] tablo1={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};

        int max=tablo1[0][0];//ilk elemani atadik
        for (int satir = 0; satir <4 ; satir++)//tablo1.length :bu satir sayisini verir
        {


        for (int sutun = 0; sutun <3 ; sutun++) {//her satirin uzunlugunu verir.
            if (tablo1[satir][sutun] > max)
                max = tablo1[satir][sutun];
        }
        }
        System.out.println("max = " + max);
    }
}
