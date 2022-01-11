import java.util.Scanner;

public class Siralama {
    public static void main(String[] args){
        int sayi1,sayi2,sayi3;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Sayi 1 : ");
        sayi1=scanner.nextInt();

        System.out.print("Sayi 2 :");
        sayi2=scanner.nextInt();

        System.out.print("Sayi 3 : ");
        sayi3=scanner.nextInt();

        if(sayi1>sayi2 && sayi1>sayi3){
            System.out.print(sayi1);
            if(sayi2>sayi3){
                System.out.print(sayi2);
                System.out.print(sayi3);
            }
        }

        if(sayi2>sayi1 && sayi2>sayi3){
            System.out.print(sayi2);
            if(sayi1>sayi3){
                System.out.print(sayi1);
                System.out.print(sayi3);
            }
        }

        if(sayi3>sayi1 && sayi3>sayi2){
            System.out.print(sayi3);
            if(sayi2>sayi1){
                System.out.print(sayi2);
                System.out.print(sayi1);
            }
        }



    }
}
