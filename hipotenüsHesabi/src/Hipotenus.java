import java.util.Scanner;

public class Hipotenus {

    public static  void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int birinciDikenar;
        int ikinciDikkenar;

        System.out.print("1.kenari giriniz : ");
        birinciDikenar=scanner.nextInt();

        System.out.print("2.kenari giriniz : ");
        ikinciDikkenar=scanner.nextInt();

        int alan=(birinciDikenar*ikinciDikkenar)/2;
        System.out.println("alan : "+alan);



    }
}
