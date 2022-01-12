import java.util.Scanner;

public class Elmas {
    public static void main(String[] args){

        int sayi;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Sayi : \t");
        sayi=scanner.nextInt();

        for(int i=0;i<=sayi;i++){

            for(int j=0;j<(sayi-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int a=0;a<=sayi;a++){
            for(int l=1;l<a+1;l++){
                System.out.print(" ");
            }

            for(int b=0;b<=2*(sayi-a);b++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
