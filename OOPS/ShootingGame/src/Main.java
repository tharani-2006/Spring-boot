
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
              Player1 p1 = new Player1("mano", "sword" ,100);
            System.out.println(p1.getName());
            System.out.println(p1.getHealth());
            System.out.println(p1.getWeapon());

            p1.damageByGun1();
            p1.damageByGun1();
            p1.damageByGun2();

            Player2 p2 = new Player2("shree", "ak47", 100,true);

            p2.damageByGun2();
            p2.damageByGun1();
            p2.damageByGun2();
            p2.damageByGun1();
    }
}