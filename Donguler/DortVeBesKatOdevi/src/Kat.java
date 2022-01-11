import java.util.Scanner;

public class Kat {
    public static void main(String[] args){
        int sayi;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Sınır sayıyı giriniz : \t");
        sayi=scanner.nextInt();

        for(int i=0;i<sayi;i++){
            if(i%4==0){
                if(i%5==0){
                    System.out.println(i+" Sayisi 4 ve 5'in katıdır.");
                }else{
                    System.out.println(i+" Sayisi 4'un katidir.");
                }
            }
            else if(i%5==0){

                if(i%4==0){
                    System.out.println(i+" Sayisi 4 ve 5'in katıdır.");
                }else{
                    System.out.println(i+" Sayisi 5'in katidir.");
                }

            }
        }


    }
}
