class Fighter { 
    String name; 
    int damage; 
    int health; 
    int weight; 
    double dodge; 
    
    public Fighter(String name, int damage, int health, int weight, double dodge) {    
        this.name = name; 
        this.damage = damage; 
        this.health = health; 
        this.weight = weight; 
        this.dodge = dodge; 
    } 
    
    public int hit(Fighter foe) { 
        System.out.println("------------"); System.out.println(this.name + " => " + foe.name + "  hit " + this.damage + " damage."); 
        
        if (foe.dodge()) { 
            System.out.println(foe.name + " dodges the incoming damage."); 
            return foe.health; 
        } 
        if (foe.health - this.damage < 0) 
            return 0; 
    
        return foe.health - this.damage; 
    } 

    public boolean dodge() { 
        double randomValue = Math.random() * 100; //0.0 to 99.9 
        return randomValue <= this.dodge; 
} 
}

class Ring { 
    Fighter f1; 
    Fighter f2; 
    int minWeight; 
    int maxWeight; 
    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) { 
        this.f1 = f1; 
        this.f2 = f2; 
        this.minWeight = minWeight; 
        this.maxWeight = maxWeight; } 
        
        public void run() { 
            if (checkWeight()) { 
                while (f1.health > 0 && f2.health > 0) { 
                    System.out.println("======== NEW ROUND ==========="); 
                    f2.health = f1.hit(f2); 
                    if (isWin()){ 
                        break; 
                    } 
                    f1.health = f2.hit(f1); 
                    if (isWin()){ 
                        break; 
                    } 
                    printScore(); 
                } 
            } else { 
                System.out.println("Athletes' weights do not match."); 
            } 
        } 
        
        public boolean checkWeight() { 
            return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight); 
        } 
        
        public boolean isWin() { 
            if (f1.health == 0) { 
                System.out.println("Winner : " + f2.name); 
                return true; 
            } else if (f2.health == 0){ 
                System.out.println("Winner : " + f2.name); 
                return true; } return false; 
            } 

        public void printScore() { 
            System.out.println("------------"); 
            System.out.println(f1.name + " Remaining right \t:" + f1.health); System.out.println(f2.name + " Remaining right \t:" + f2.health); 
        } 
    }


class Match{
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        if(isChance()){
            this.f1 = f1;
            this.f2 = f2;
        }else {
            this.f1 = f2;
            this.f2 = f1;
        }

        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public void run(){
        if(isCheck()){
            while(this.f1.health > 0 && this.f2.health > 0){
                f2.health = f1.hit(f2);
            }
        }else{
            System.out.println("Athletes' weights do not match.");
        }
    }

    boolean isCheck(){
        return (this.f1.weight>= minWeight && this.f1.weight <= maxWeight ) && (this.f2.weight>= minWeight && this.f2.weight <= maxWeight );
    }

    boolean isChance(){
        double randomChance = Math.random() * 100;
        if(randomChance <= 50){
            return true;
        }
        return false;

    }
}


public class BoxingMatch {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0); 
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0); 
        Ring r = new Ring(marc,alex , 90 , 100); r.run();
    }
}