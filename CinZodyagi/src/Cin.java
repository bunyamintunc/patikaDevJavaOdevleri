import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Cin {
    public static  void main(String[] args){
        int dogumTarihi;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Dogum Yiliniz : ");
        dogumTarihi=scanner.nextInt();

        int kalan=dogumTarihi%12;
        switch (kalan){
            case 0:
                System.out.print("Maymun");
                break;
            case 1:
                System.out.print("Horoz");
                break;
            case 2:
                System.out.print("Kopek");
                break;
            case 3:
                System.out.print("Domuz");
                break;
            case 4:
                System.out.print("Fare");
                break;
            case 5:
                System.out.print("Okuz");
                break;
            case 6:
                System.out.print("Kaplan");
                break;
            case 7:
                System.out.print("Tavşan");
                break;
            case 8:
                System.out.print("Ejderha");
                break;
            case 9:
                System.out.print("Yılan");
                break;
            case 10:
                System.out.print("At");
                break;
            case 11:
                System.out.print("Koyun");
                break;
            default:
                System.out.print("Bir hata var!");
                break;
        }
    }
}
