import java.util.Scanner;

public class Kdv {
    public static  void main(String[] args){

        double KDV18=0.18;
        double KDV08=0.08;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Yatırılacak parayi giriniz : ");
        int yatirilanPara=scanner.nextInt();

        boolean sifirdanBuyukMu=(yatirilanPara>0);
        boolean bindenKucukMu=(yatirilanPara<100);
        boolean bindenBuyukMu=(yatirilanPara>100);

        double kdvTutar = yatirilanPara<=0 ? 0:(yatirilanPara<=1000 ? KDV18:KDV08);
        System.out.println("YatirilanPara : "+yatirilanPara);
        System.out.println((kdvTutar<=0)? "yatirilan para 0 veya 0 dan kucuk olamaz" :("Kdv'li hali :"+yatirilanPara+(yatirilanPara*kdvTutar)) );



    }
}
