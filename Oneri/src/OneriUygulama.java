import java.util.Scanner;

public class OneriUygulama {

    public  static void main(String[] args){

        int havaSicaklik;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Hava Kaç Derece : ");
        havaSicaklik=scanner.nextInt();

        if(havaSicaklik<5){
            System.out.print("Kayak yapabilirsin.");
        }else if(havaSicaklik<25 && havaSicaklik>5){
            if(havaSicaklik<15){
                System.out.print("Sinemaya gidebilirsin");
            }
            else{
                System.out.print("Pikniğe gidebilirsin");
            }
        }
        else{
            System.out.print("Yüzmeye gidebilirisin ");
        }
    }
}
