import java.util.Scanner;

public class Mukemmel {
    public static void main(String[] args){
        int sayi,toplam=0;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen test sayısını giriniz : ");
        sayi=scanner.nextInt();
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                toplam+=i;
            }
        }
        if(sayi==toplam){
            System.out.print(sayi+" Sayisi bir mükemmel sayidir.");
        }
        else {
            System.out.print(sayi+" Sayisi bir mükemmel sayi değidir");
        }
    }
}
