import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Hesap {

    public static void main(String[] args){
        int tercih;
        boolean drum=true;

        Scanner scanner=new Scanner(System.in);

        while (drum){
            System.out.println("1-\t : Toplama");
            System.out.println("2-\t : Çıkarma");
            System.out.println("3-\t : Çarpma");
            System.out.println("4-\t : Bölme");
            System.out.println("5-\t : Uslu Sayi Hesabı");
            System.out.println("6-\t : Faktoriel");
            System.out.println("7-\t : Mod Alma");
            System.out.println("8-\t : Dikdortgen Alan hesabi");
            System.out.println("Yapmak istediğiniz islem-->");
            tercih=scanner.nextInt();

            switch (tercih){
                case 1:
                    topla();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    us();
                    break;
                case 6:
                    faktoriel();
                    break;
                case 7:
                    mod();
                    break;
                case 8 :
                    alan();
                    break;
                default:
                    drum=false;
                    break;









            }
        }

    }
    static void topla(){
        int sayi,toplam=0;
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("Sayi : ");
            sayi=scanner.nextInt();
            if(sayi==0){
                break;
            }
            else{
                toplam+=sayi;

            }

        }
        System.out.println("Toplam : "+toplam);
    }
    static  void cikar(){
        int sayi1,sayi2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("1.Sayi : ");
        sayi1=scanner.nextInt();
        System.out.print("2.Sayi : ");
        sayi2=scanner.nextInt();
        System.out.print("Sonuc : "+(sayi1-sayi2));
    }
    static void carp(){
        int sayiAdedi,sayi,sonuc=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç adet sayi çarpacaksınız :");
        sayiAdedi=scanner.nextInt();
        for(int i=0;i<sayiAdedi;i++){
            System.out.print(i+". Sayi :");
            sayi=scanner.nextInt();
            sonuc*=sayi;
        }
        System.out.print("Sonuc : "+sonuc);
    }
    static void bol(){
        int sayi1,sayi2;
        Scanner scanner=new Scanner(System.in);

        System.out.print("1.Sayi giriniz :");
        sayi1=scanner.nextInt();

        while (true){
            System.out.println("2.Sayiyi giriniz :");
            sayi2=scanner.nextInt();
            if(sayi2==0){
                System.out.print("BOLEN 0 OLAMAZ !! TEKRAR GİRİNİZ :");
            }
            else {
                break;
            }

        }
        System.out.println("Sonuc : "+(sayi1/sayi2));
    }
    static void us(){
        int sayi1,sayi2,sonuc=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayi : ");
        sayi1=scanner.nextInt();
        System.out.print("ussu : ");
        sayi2=scanner.nextInt();

        for(int i=0;i<sayi2;i++){
            sonuc*=sayi1;
        }
        System.out.println("Sonuc : "+sonuc);
    }
    static void faktoriel(){
        int sayi,sonuc=1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Fkatorieli alinacak sayi : ");
        sayi=scanner.nextInt();
        for(int i =1;i<=sayi;i++){
            sonuc*=i;
        }
        System.out.println("Sonuc : "+sonuc);
    }
    static void mod(){
        int sayi,mod;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sayi : ");
        sayi=scanner.nextInt();
        System.out.print("Mod : ");
        mod=scanner.nextInt();

        System.out.println("Sonuc : "+(sayi%mod));
    }
    static void alan(){
        int kisa,uzun;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kısa : ");
        kisa=scanner.nextInt();
        System.out.print("uzun : ");
        uzun=scanner.nextInt();
        System.out.println("Sonuc : "+(kisa*uzun));
    }
}
