import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args){
        int hesapBakiyesi=1500;
        int cekilenPara;
        int yatirilanPara;
        int hak=3;
        int tercih;
        String kullaniciAdi="",sifre;

        Scanner scanner=new Scanner(System.in);

        boolean drum=false;
        boolean sifreDevam=true;


        while (sifreDevam){
            System.out.print("Kullanici Adiniz : \t");
            kullaniciAdi=scanner.nextLine();
            System.out.print("Sifre : \t");
            sifre=scanner.nextLine();
            if(kullaniciAdi.equals("bunyamin")&&sifre.equals("12345")){
                drum=true;
                sifreDevam=false;
            }
            else{
                hak-=1;
                if(hak<=0){
                    sifreDevam=false;
                }
            }

        }
        if(hak<=0){
            System.out.println("Hesabınız bloke oldu");
        }
        while(drum){


            System.out.println("\t X Bankasına hoşgeldiniz!!! \t");
            System.out.println("1-\t Para Çekme");
            System.out.println("2-\t Para Yatirma");
            System.out.println("3-\t Sifre Degistirme");
            System.out.println("4-\t Bakiye goruntule");
            System.out.println("5\t Çıkıs" );
            System.out.print("Lütfen Yapmak istediğiniz islemi seçiniz -->");
            tercih=scanner.nextInt();

            switch (tercih){
                case 1:
                    System.out.print("Cekmek istediğiniz miktar : ");
                    cekilenPara=scanner.nextInt();
                    hesapBakiyesi-=cekilenPara;
                    System.out.print("İşlem yapmaya devam etmek istiyor musunuz?[1-evet || 2-hayır] : ");
                    tercih=scanner.nextInt();
                    if(tercih==2){
                        drum=false;
                    }
                    break;

                case 2:
                    System.out.print("Yatirmak istediğiniz Miktar : ");
                    yatirilanPara=scanner.nextInt();
                    hesapBakiyesi+=yatirilanPara;
                    System.out.println("Yatirma İsleminiz Basarili bir selide gerçekleşti: )");
                    System.out.print("İşlem yapmaya devam etmek istiyor musunuz?[1-evet || 2-hayır] : ");
                    tercih=scanner.nextInt();
                    if(tercih==2){
                        drum=false;
                    }
                    break;
                case 3:
                    System.out.print("Yeni sifre : ");
                    System.out.print("İşlem yapmaya devam etmek istiyor musunuz?[1-evet || 2-hayır] : ");
                    tercih=scanner.nextInt();
                    if(tercih==2){
                        drum=false;
                    }
                    break;
                case 4:
                    System.out.print("HOSGELDİNİZ "+kullaniciAdi+"bey ");
                    System.out.println("Guncel Bakiyeniz : "+hesapBakiyesi);
                    break;
                case 5:
                    System.out.println("İyi Günler dileriz :)");
                    drum=false;
                    break;
                default:



            }
            System.out.println("İyi Günler dileriz :)");


        }

    }
}
