import java.util.Scanner;

public class Combinasyon {
    public static void main(String[] args){
        int N;
        int R;

        Scanner scanner=new Scanner(System.in);
        System.out.print("N : ");
        N=scanner.nextInt();
        System.out.print("R : ");
        R=scanner.nextInt();

        int nKombinasyon=1;
        for(int i=1;i<=N;i++){
            nKombinasyon*=i;
        }

        int rKombinasyon=1;
        for(int i=1;i<=R;i++){
            rKombinasyon*=i;
        }

        int r_nKombinasyon=1;
        for(int i=1;i<=(N-R);i++){
            r_nKombinasyon*=i;
        }

        double sonuc=(nKombinasyon)/(r_nKombinasyon*rKombinasyon);
        System.out.print("Sonuc : "+sonuc);
    }
}
