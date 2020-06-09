import java.io.Serializable;

public class Player implements Serializable {

    int health;
    int mana;
    int defense;
    int attack;
    String name;

    public Player() {

    }

    public Player (int health, int mana, int defense, int attack, String name) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.defense = defense;
        this.attack = attack;
    }


    public void Elf() {
        health = 9;
        mana = 9;
        defense = 6;
        attack = 4;
        mainClass.characterNaming();
    }

    public void Human() {
        health = 10;
        mana = 8;
        defense = 5;
        attack = 5;
        mainClass.characterNaming();
    }

    public void Orc() {
        health = 14;
        mana = 4;
        defense = 2;
        attack = 8;
        mainClass.characterNaming();
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n health: " + health + "\n mana: " + mana + "\n defense: " + defense +
                "\n attack: " + attack;
    }

    public void showClass() {
        System.out.println("Your name is: " + this.name);
        System.out.println("Your health is: " + this.health);
        System.out.println("Your mana is: " + this.mana);
        System.out.println("Your attack is: " + this.attack);
        System.out.println("Your defense is: " + this.defense);
    }
}
