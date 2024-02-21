package Gun21;

public class _03_Tablo2 {
    public static void main(String[] args) {

//  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et
        int[][] tablo1={

                {1,2},
                {2,3,1} ,
                {5,5,5,4,8} ,
                {2,10,3}

        };//bir önceki soru ile ayni,asagi dagitilmis hali
        System.out.println("tablo1.length = " + tablo1.length);// satirin elaman sayisi
        System.out.println("tablo1.length = " + tablo1[0].length);//1. satirin elaman sayisi
        System.out.println("tablo1.length = " + tablo1[1].length);//2.satirin elaman sayisi
        System.out.println("tablo1.length = " + tablo1[2].length);//3. satirin elaman sayisi
        System.out.println("tablo1.length = " + tablo1[3].length);//4. satirin elaman sayisi

        for (int satir = 0; satir <tablo1.length ; satir++)
        {
            for (int sutun = 0; sutun <tablo1[satir].length ; sutun++)
            {
                System.out.print(tablo1[satir][sutun]+" ");

            }
            System.out.println();
        }
    }
}
