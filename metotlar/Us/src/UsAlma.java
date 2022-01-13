import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args){
        int sayi,us;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Taban : ");
        sayi=scanner.nextInt();
        System.out.print("Us : ");
        us=scanner.nextInt();

        us(sayi,us);

    }
    static void us(int taban,int us){
        int sonuc=1;
        for(int i =0;i<us;i++){
            sonuc*=taban;

        }
        System.out.println("Taban : "+taban);
        System.out.println("Us : "+us);
        System.out.println("Sonuc : "+sonuc);
    }
}
