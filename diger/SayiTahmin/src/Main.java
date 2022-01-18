import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int random = (int)(Math.random()*100);
        int tahminHakki=5;
        int tahmin=0;
        Scanner scanner=new Scanner(System.in);

        while(tahminHakki>0){



                System.out.print("Lütfen 0 ile 100 arasında Tahmininizi giriniz : ");
                tahmin=scanner.nextInt();

                System.out.println();

            if(isWin(random,tahmin)){
                System.out.println("Kazandınız!!! tahmininiz doğru");
                break;
            }else {
                tahminHakki--;
                System.out.println("Tahmininiz yanlış "+tahminHakki +" hakkınız kaldı");
                if(tahminHakki==0){
                    System.out.println("Kaybettiniz.");

                }
            }


        }

    }
    static boolean isWin(int a,int b){
        if(a==b){
            return  true;
        }else {
            return false;
        }
    }
}
