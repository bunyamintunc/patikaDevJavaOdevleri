import java.util.Scanner;

public class Polindromm {
    public static void main(String[] args){
        int sayi;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Sayi : ");
        sayi=scanner.nextInt();

        int a=isPolindrom(sayi);
        if(a==sayi){
            System.out.print(sayi+" Sayisi bir polindrom sayıdır");
        }else{
            System.out.print(sayi+" Sayisi bir polindrom sayi değildir.");
        }


    }
    static int isPolindrom(int gelenSayi){

        int tutSayi=gelenSayi;

        if(tutSayi>0){
            int deger=tutSayi%10;
            tutSayi=tutSayi/10;
            return deger+isPolindrom(tutSayi)*10;
        }else{
            return 0;
        }

    }
}
