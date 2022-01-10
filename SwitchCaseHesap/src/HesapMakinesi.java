import java.util.Scanner;

public class HesapMakinesi {

    public static  void main(String[] args){
        int tercih;
        int sayi1,sayi2;

        Scanner scan=new Scanner(System.in);

        System.out.print("Sayi-1 : ");
        sayi1=scan.nextInt();
        System.out.print("Sayi-2 : ");
        sayi2=scan.nextInt();

        System.out.print("1-toplama \n 2-çıkarma \n 3-çarpma \n tercih-->");
        tercih=scan.nextInt();

        switch (tercih){
            case 1:
                System.out.print("toplam "+(sayi1+sayi2));
                break;
            case 2:
                System.out.print("Çıkarma "+(sayi1-sayi2));
                break;
            case 3:
                System.out.print("çarpma : "+(sayi1*sayi2));
                break;

        }

    }
}
