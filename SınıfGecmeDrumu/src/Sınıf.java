import java.util.Scanner;

public class Sınıf {

    public  static void main(String[] args){
        int Matematik, Fizik, Turkce, Kimya, Muzik;
        int sayac=0,toplam=0;
        Scanner scanner=new Scanner(System.in);


        System.out.print("Matematik notunuz : ");
        Matematik=scanner.nextInt();
        if(Matematik>0 && Matematik<=100){
            sayac++;
            toplam+=Matematik;
        }

        System.out.print("Fizik notunuz : ");
        Fizik=scanner.nextInt();
        if(Fizik>0 && Fizik<=100){
            sayac++;
            toplam+=Fizik;
        }

        System.out.print("Türkçe notunuz : ");
        Turkce=scanner.nextInt();
        if(Turkce>0 && Turkce<=100){
            sayac++;
            toplam+=Turkce;
        }

        System.out.print("Kimya notunuz : ");
        Kimya=scanner.nextInt();
        if(Kimya>0 && Kimya<=100){
            sayac++;
            toplam+=Kimya;
        }

        System.out.print("Muzik notunuz : ");
        Muzik=scanner.nextInt();
        if(Muzik>0 && Muzik<=100){
            sayac++;
            toplam+=Muzik;
        }

        double ortalama=toplam/sayac;
        System.out.print("ortlama : "+ortalama);

    }
}
