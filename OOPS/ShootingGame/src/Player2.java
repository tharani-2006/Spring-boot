public class Player2 extends Player1{
    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        if(health < 0 || health> 100){
            this.health = health;
        }else{
            this.health = 100;
        }
        this.armour = armour;
    }

    @Override
    public void damageByGun1(){
        if(armour){
            this.health -= 20;
            if(this.health <=0 ) {
                this.health = 0;
            }
            System.out.println("Armour is on.got hit on gun1 .health reduced by 20 " + "New health is "+ this.health);
        }
        if(!armour){
            this.health -= 30;
            if(this.health <=0 ) {
                this.health = 0;
            }
            System.out.println("Armour is off.got hit on gun1 .health reduced by 30 " + "New health is "+ this.health);
        }
        if(this.health == 0) System.out.println(getName() + " is died");
    }

    @Override
    public void damageByGun2() {
        if(armour){
            this.health -= 40;
            if(this.health <=0 ) {
                this.health = 0;
            }
            System.out.println("Armour is on.got hit on gun2 .health reduced by 40 " + "New health is "+ this.health);
        }
        if(!armour){
            this.health -= 50;
            if(this.health <=0 ) {
                this.health = 0;
            }
            System.out.println("Armour is off.got hit on gun2 .health reduced by 50 " + "New health is "+ this.health);

        }
        if(this.health == 0) System.out.println(getName() + " is died");
    }
}
