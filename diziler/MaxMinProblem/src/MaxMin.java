public class MaxMin {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 0, 4, 5, 6, 7};
        int max = 0, min = 0;
        max = dizi[0];
        min = dizi[0];
        for(int i=0;i<dizi.length;i++){
            if(i+1< dizi.length){
                if (dizi[i]>dizi[i+1]){
                    max=dizi[i];
                }
                else {
                    max=dizi[i+1];
                }

            }
            if(i+1<dizi.length){
                if (min>dizi[i]) {
                    min=dizi[i];
                }
            }

        }
        System.out.println(max+"---  "+min);

    }}
