public class Main {
    public static void main(String[] args) {
        String[][] dizi=new String[9][5];

        for(int i=0;i<dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){

                if (i == 0 || i==8 || j==4 || j==0 || i==4) {

                    dizi[i][j] = "*";
                }
                else{
                    dizi[i][j]=" ";
                }

            }
        }
        for(int i=0;i<dizi.length;i++){
            for (int j=0;j<dizi[i].length;j++){
                System.out.print(dizi[i][j]+" ");

            }
            System.out.println();
        }


    }


}
