import java.util.Scanner;

public class Daire {

    public static void main(String[] args){
         final double PI=3.14;
         int yariCap;

        Scanner scanner =new Scanner(System.in);

        System.out.print("Dairenin Yari Çapi : ");
        yariCap=scanner.nextInt();


        double cevreHesap= 2*PI*yariCap;
        double alanHesabi=PI*yariCap*yariCap;

        System.out.println("ÇEVRE : "+cevreHesap);
        System.out.println("ALAN : "+alanHesabi);

    }
}
