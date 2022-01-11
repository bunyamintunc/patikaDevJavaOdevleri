import java.util.Scanner;

public class Bilet {

    public static void main(String[] args){
        int yas,mesafe,yolculukTip;
        double tutar;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Yaş : ");
        yas=scanner.nextInt();

        System.out.print("Mesafe(Km cinsinden) : ");
        mesafe=scanner.nextInt();

        System.out.print("Yolculuk Tipi[1-->Tek gidis | 2-->Gidis donus] : ");
        yolculukTip=scanner.nextInt();

        if(yas<=0){
            System.out.print("Hatali  giris yaptiniz.");
        }else if(mesafe<=0){

            System.out.print("hatali giris yaptiniz.");
        }else if(yolculukTip<1 && yolculukTip>2 ){
            System.out.print("Hatali giris yaptiniz.");
        }else{

            tutar=mesafe*0.2;
            if(yas<12){
                if(yolculukTip==2){
                    tutar=(tutar-(tutar/2))*0.2;
                    System.out.print("Tutar : "+(tutar/2));
                }
                else{
                    System.out.print("Tutar : "+(tutar/2));
                }

            }
            else if(yas>12 && yas<24){

                tutar=tutar-(tutar*0.1);
                if(yolculukTip==2){
                    tutar=tutar-(tutar*0.2);
                    System.out.print("Tutar : "+tutar);
                }else{
                System.out.print("Tutar : "+tutar);
            }}
            else if(yas>65){
                tutar=tutar-(tutar*0.3);
                if(yolculukTip==2){
                    tutar=tutar-(tutar*0.2);
                    System.out.print("Tutar : "+tutar);
                }
                else {
                    System.out.print("Tutar: "+tutar);
                }

            }
            else if(yolculukTip==2){
                tutar=tutar-(tutar*0.2);
                System.out.print("Tutar: "+tutar);
            }
            else{
                System.out.print("Tutar : "+tutar );
            }

        }
    }
}
