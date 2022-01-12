import java.util.Scanner;

public class Basamak {

    public static void main(String[] args){
        int sayi;

        Scanner scanner =new Scanner(System.in);

        System.out.print("Sayi giriniz : \t");
        sayi=scanner.nextInt();
       //Amstrong Sayi bulma
       /*
       int basamakSayisi=0;
        int kalanSayi;
        int toplam=0;
        int basamak;


        kalanSayi=sayi;

        while (kalanSayi!=0){
            kalanSayi/=10;
            basamakSayisi++;
        }
        kalanSayi=sayi;

        while(kalanSayi>0){
            int kalan=kalanSayi%10;
            int basamakUssu=1;
            for(int i=0;i<basamakSayisi;i++){
                basamakUssu=basamakUssu*kalan;
            }
            kalanSayi=kalanSayi/10;
            toplam+=basamakUssu;

        }
        if(sayi==toplam){
            System.out.println(sayi+" Sayisi bir Amstrong sayidir.");
        }

        */
        while (sayi>0){
            int basamak=sayi%10;
            System.out.println(basamak);
            sayi=sayi/10;
        }




    }
}
