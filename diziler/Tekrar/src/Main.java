public class Main {


    public static void main(String[] args) {


        int[] dizi={1,2,3,4,5,6,7,1,2,2};
        int[] tut=new int[dizi.length];
        int index=0;

        for(int i=0;i<dizi.length;i++){
            int sayi=1;
            if (varMi(tut,dizi[i])){
                for(int j=i+1;j<dizi.length;j++){
                    if(dizi[i]==dizi[j]){
                        tut[index]=dizi[i];
                        sayi++;
                    }

                }
            }

            index++;
            if(sayi>1){
                System.out.println(dizi[i]+"-"+sayi);
            }
        }
    }
    static boolean varMi(int[] arr,int value){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return false;
            }
        }
        return true;

    }
}
