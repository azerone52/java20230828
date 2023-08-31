package ch08interface.lecture;

public class C06polymorphism {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setWeapon(new Gun());
        hero.attack();

        hero.setWeapon(new Bow());
        hero.attack();

        System.out.println("게임 종료");
    }
}
class Hero{
    public Weapon w;
    public void setWeapon(Weapon weapon){
        this.w = weapon;
    }
    public void attack(){
        w.trigger();
    }
}
interface Weapon {
    void trigger();
}
class Gun implements  Weapon{
    @Override
    public void trigger() {
        System.out.println("총을 쏩니다.");
    }
}
class Bow implements Weapon{
    @Override
    public void trigger() {
        System.out.println("활을 쏩니다.");
    }
}
