public class Ring {

    Booksor booksorBir;
    Booksor booksorIki;
    int min;
    int max;
    double baslamaİhtimali=Math.random()*1;
    public Ring(Booksor boksorBir,Booksor boksorIki,int max,int min){
        this.booksorBir=boksorBir;
        this.booksorIki=boksorIki;
        this.min=min;
        this.max=max;
    }
    void run(){
        if(isCheck()){
            while (booksorBir.health>0 && booksorIki.health>0){
                if(baslamaİhtimali>=0 && baslamaİhtimali<50){
                    System.out.println("=======YENİ RAUND=======");

                    System.out.println(booksorBir.name+" "+booksorIki.name +" 'e vurdu!");
                    booksorIki.health=booksorIki.hit(booksorBir);

                    System.out.println(booksorIki.name+" "+booksorBir.name +" 'e vurdu!");
                    booksorBir.health=booksorBir.hit((booksorIki));
                    System.out.println(booksorBir.name+"'nin canı : "+booksorBir.health);
                    System.out.println(booksorIki.name+" 'nin canı : "+booksorIki.health);
                }else{
                    System.out.println("=======YENİ RAUND=======");

                    System.out.println(booksorIki.name+" "+booksorBir.name +" 'e vurdu!");
                    booksorBir.health=booksorBir.hit(booksorIki);

                    System.out.println(booksorBir.name+" "+booksorIki.name +" 'e vurdu!");
                    booksorIki.health=booksorIki.hit((booksorBir));
                    System.out.println(booksorBir.name+"'nin canı : "+booksorBir.health);
                    System.out.println(booksorIki.name+" 'nin canı : "+booksorIki.health);

                }


            }
        }
    }


    boolean isCheck(){

        if((booksorIki.weight>=min && booksorIki.weight<=max)&&(booksorBir.weight>=min && booksorBir.weight<=max)){
            return true;

        }else {
            System.out.println("Boksorlerin kiloları max ve min değer aralığında olmalıdır.");
            return false;
        }
    }

}
