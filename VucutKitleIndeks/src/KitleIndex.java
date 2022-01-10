import java.util.Scanner;

public class KitleIndex {

    public static void main(String[] args){
        double kilo;
        double boy;

        Scanner scanner=new Scanner(System.in);

        System.out.print("KİLO : ");
        kilo=scanner.nextDouble();

        System.out.print("BOY (Metre Cinsinden) : ");
        boy=scanner.nextDouble();

        double kitleİndeksHesap= kilo / (boy*boy);

        System.out.println("Kitle indeks : "+kitleİndeksHesap);

    }
}
