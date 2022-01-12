public class Fibonacci {
    public static void main(String[] args){
        int  ilkSayi=0,ikinciSayi=1,tut;

        System.out.print(ilkSayi+" ");

        for(int i =0;i<10;i++){
            tut=ikinciSayi;
            System.out.print(tut+" ");
            ikinciSayi=ilkSayi+ikinciSayi;
            ilkSayi=tut;



        }
    }
}
