import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] dizi={{1,2,3,4},{5,6,7,8}};
        int[][] transposem=new int[4][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                transposem[j][i]=dizi[i][j];
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                System.out.print(transposem[i][j]+" ");
            }
            System.out.println();
        }


    }
}
