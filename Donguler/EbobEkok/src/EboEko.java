import java.util.Scanner;

public class EboEko {

    public  static void main(String[] args){
        int sayiBir,sayiIki;
        int ebob=0,ekok,buyuk,tut;
        boolean drum=true;

        Scanner scanner=new Scanner(System.in);

        System.out.print("1.Sayiyi giriniz :");
        sayiBir=scanner.nextInt();
        System.out.print("2.Sayiyi giriniz : ");
        sayiIki=scanner.nextInt();

        if(sayiBir>sayiIki){
            buyuk=sayiBir;

        }else {
            buyuk=sayiIki;
        }
        tut=buyuk;

        while (drum){
            if(sayiBir%tut==0 && sayiIki%tut==0){
                ebob=tut;
                drum=false;

            }
            tut--;

        }
        System.out.println(sayiBir+"ve"+sayiIki+" sayisinin Ebobu : "+ebob);
        System.out.println(sayiBir+"ve"+sayiIki+" sayisinin Ekoku : "+(sayiBir*sayiIki)/ebob);

    }
}
