public class Main {
    public static void main(String[] args) {
        String kelime="abaA";
        if(isPolindrom(kelime)){
            System.out.println(kelime+" Bir polindrom kelimedir.");
        }else{
            System.out.println(kelime+ " bir polindrom kelime değildir.");
        }
    }
    static boolean isPolindrom(String kelime){
        String karsilastir="";
        for(int i=kelime.length()-1;i>=0;i--){
            karsilastir+=kelime.charAt(i);
        }
        if(kelime.equals(karsilastir)){
            return true;
        }else {
            return false;
        }
    }
}
