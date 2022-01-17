public class Harmoni {
    public static void main(String[] args) {
        int[] dizi={1,1,1,1,1,1};
        double harmonikToplam=0;
        harmonikToplam+=1;
        for(int a:dizi){
            harmonikToplam+=1/a;
        }
        System.out.println(harmonikToplam);
    }
}
