

public class Booksor {

    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Booksor(String name,int damage,int health,int weight,int dodge){
        this.damage=damage;
        this.dodge=dodge;
        this.health=health;
        this.weight=weight;
        this.name=name;


    }

    int hit(Booksor rakip){
        if(isDodge()){
            System.out.println(this.name +" "+rakip.name +" in hamlesinden kaçti:");
            return this.health;
        }
            if(this.health- rakip.damage<0){
                return 0;
            }
            return  this.health=this.health- rakip.damage;




    }

    boolean isDodge(){

        double rastGele=Math.random()*100;
        return rastGele<=this.dodge;


    }
}
