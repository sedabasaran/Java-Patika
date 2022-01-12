public class Figther {
    String name;
    int damage;
    int healthy;
    int weight;
    int dodge;

    Figther(String name,int damage, int healthy,int weight,int dodge){
        this.name = name;
        this.damage = damage;
        this.healthy = healthy;
        this.weight = weight;
        if(dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }else{
            this.dodge = 0;
        }

    }
    int hit(Figther foe){
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu");
        if(foe.isDodge()){
            System.out.println(foe.name + " gelen hasarı blokladı.");
            System.out.println("---------- ----------");
            return foe.healthy;
        }

        if(foe.healthy - this.damage < 0){
            return 0;
        }
        return foe.healthy - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
