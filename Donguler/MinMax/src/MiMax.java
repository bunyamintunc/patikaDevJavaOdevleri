import java.util.Scanner;

public class MiMax {
    public static void main(String[] args){
        int sayiAdedi,tut=0,girilenSayi;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Kaç adet sayi girmek istersiniz : ");
        sayiAdedi=scanner.nextInt();

        for(int i=0;i<sayiAdedi;i++){
            System.out.print(i+". Sayi -->");
            girilenSayi=scanner.nextInt();
            if(i==0){
                tut=i;
            }
            else {
                if(tut>girilenSayi){
                    continue;
                }
                else {
                    tut=girilenSayi;
                }
            }
        }
        System.out.print("EN BUYUK SAYI : "+tut);
    }
}
