import java.util.Scanner;

public class Odev {
    public static void main(String[] args){
        double toplam=0;
        int adet=0;
        int sayi;

        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Sayi Giriniz : \t");
            sayi=scanner.nextInt();
            toplam+=sayi;
            adet+=1;
        }while (sayi!=0);
        System.out.print("Ortalama : "+(toplam/adet));
    }
}
