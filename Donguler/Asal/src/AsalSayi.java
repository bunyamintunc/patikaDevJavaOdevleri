public class AsalSayi {
    public static void main(String[] args){
        for(int i=2;i<=100;i++){
            int counter=0;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    counter++;
                }
            }
            if(counter<=1){
                System.out.println(i);
            }
        }
    }
}
