import java.util.Scanner;

public class Fibonaci {
    public static void main(String[] args){
        int basamakSayisi;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Kac basamak görmek istersiniz-->");

        fibo(1);


    }

    static int fibo(int basamak){

        if (basamak>20){
             int toplam=basamak;
             return toplam+fibo(basamak+1);
        }


    }
}
