import java.util.Scanner;

public class Seri {
    public static void main(String[] args){

        int sayi,i=0;
        double toplam=0;

        Scanner scanner =new Scanner(System.in);

        System.out.print("Sayi giriniz : \t");
        sayi=scanner.nextInt();

        while(i<10){

            for(int j=1;j<10;j++){
                toplam+=(sayi/j);
            }
            i++;

        }
        System.out.println(toplam);


    }
}
