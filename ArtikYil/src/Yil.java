import java.util.Scanner;

public class Yil {

    public static void main(String[] args){
        int yil;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Yil Giriniz : ");
        yil=scanner.nextInt();

         if(yil%4==0){
             if((yil%100==0 && yil%400==0)||(yil%4==0 && yil%100!=0)){
                 System.out.print(yil+" bir artik yil");

             }
         }
    }
}
