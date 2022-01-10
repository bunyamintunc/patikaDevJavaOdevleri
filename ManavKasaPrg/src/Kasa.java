import java.util.Scanner;

public class Kasa {

    public static  void main(String[] args){
        double elmaKilo=3.67,elmaMiktar;
        double armutKilo=2.14,artmuMiktar;
        double domatesKilo=1.11,domatMiktar;
        double patlicanKilo=5.00,patlicanMiktar;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Elma kilo : ");
        elmaMiktar=scanner.nextDouble();

        System.out.print("Armut kilo : ");
        artmuMiktar=scanner.nextDouble();

        System.out.print("Domates kilo : ");
        domatMiktar=scanner.nextDouble();

        System.out.print("Patlican kilo : ");
        patlicanMiktar=scanner.nextDouble();

        double tutar=(elmaKilo*elmaMiktar)+(armutKilo*artmuMiktar)+(domatesKilo*domatMiktar)+(patlicanKilo*patlicanMiktar);

        System.out.print("Tutar : "+tutar);
    }
}
