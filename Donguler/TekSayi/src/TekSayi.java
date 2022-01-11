import java.util.Scanner;

public class TekSayi {

    public  static void main(String[] args){
        double toplam=0;
        int adet=0;
        int sayi=0;

        Scanner scanner=new Scanner(System.in);


        do{
            System.out.print("Sayi giriniz : \t");
            sayi=scanner.nextInt();
            adet+=1;
            if(sayi%2==0 && sayi%4==0){
                toplam+=sayi;
            }

        }while(sayi%2==0);

        System.out.print("Ortalama : "+(toplam/adet));
    }
}
