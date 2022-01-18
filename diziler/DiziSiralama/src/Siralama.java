import java.util.Arrays;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int diziBoyutu;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Dizi boyutunu giriniz : ");
        diziBoyutu=scanner.nextInt();

        int[] dizi=new int[diziBoyutu];

        for(int i=0;i<diziBoyutu;i++){
            System.out.println(i+1+". Elemani giriniz." );
            dizi[i]=scanner.nextInt();
        }

        Arrays.sort(dizi);

        System.out.println(Arrays.toString(dizi));
    }
}
