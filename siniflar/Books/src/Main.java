public class Main {

    public static void main(String[] args) {
        Booksor booksorBir=new Booksor("Bunyamin",20,100,80,10);
        Booksor booksorIki=new Booksor("emre",21,100,85,50);

        Ring ring=new Ring(booksorBir,booksorIki,100,0);
        ring.run();
    }
}
