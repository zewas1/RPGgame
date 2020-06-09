import java.util.Scanner;

public class Player {

    int health;
    int mana;
    int defense;
    int attack;
    String name;

    Scanner scan = new Scanner(System.in);

    public void Elf() {
        health = 10;
        mana = 8;
        defense = 5;
        attack = 5;
        characterNaming();
    }

    public void Human() {
        health = 10;
        mana = 8;
        defense = 5;
        attack = 5;
        characterNaming();
    }

    public void Orc(){
        health = 12;
        mana = 4;
        defense = 5;
        attack = 8;
        characterNaming();
    }

    public void showClass(){
        System.out.println("Your name is: " + this.name);
        System.out.println("Your health is: " + this.health);
        System.out.println("Your mana is: " + this.mana);
        System.out.println("Your attack is: " + this.attack);
        System.out.println("Your defense is: " + this.defense);
    }

    private void characterNaming() {
        System.out.println("What's your name, Traveler?");
        name = scan.next();
    }

}
