import java.util.Scanner;

public class Sifre {

    private static String ad="bunyamin";
    private static int sifre=12345;


    public static  void main(String[] args){
        String kullaniciAdi;
        int sifre;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Kullanici Adiniz : ");
        kullaniciAdi=scanner.nextLine();

        System.out.print("Sifreniz : ");
        sifre=scanner.nextInt();

        if(sifreKontrol(sifre)){
            System.out.print("Sisteme başarılı bir şekilde giriş yaptınız :) ");
        }
        else{
            System.out.print("Girmiş olduğunuz şifre yanlış. şifrenizi değiştirmek ister misiniz?[1/0]-->");
            int secim=scanner.nextInt();
            if(secim==1){

                System.out.print("Yeni sifre : ");
                int yeniSifre=scanner.nextInt();
                if(yeniSifre==sifre){
                    System.out.print("yeni şifreniz eskisi ile aynı olamaz!");
                }
                else{
                    System.out.print("sifreniz basari ile değiştirildi");
                    sifre=yeniSifre;
                }


            }
            else{
                System.out.print("iyi günler");
            }
        }

    }
    public static  boolean sifreKontrol(int a){
        if(a!=sifre){
            return false;
        }
        else{
            return true;
        }
    }





}
