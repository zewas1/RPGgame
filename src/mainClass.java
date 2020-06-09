import java.io.*;
import java.util.Scanner;

public class mainClass {

    public static final Scanner scan = new Scanner(System.in);
    public static int selectClass = 0;
    public static Player player = new Player();

    public static void main(String[] args) {

        int action = 0;

        do {
            action = getAction();
            if (action == 1){
                raceSelection(player);
            }
            if (action == 2){
                gameSave();
            }
            if (action == 3){
                gameLoad();
            }
            if (action == 4){
                player.showClass();
            }
        } while (action != 5);
        System.out.println("Thank you for playing!");

    }

    private static int getAction() {
        int action;
        System.out.println("|============================================================|");
        System.out.println("|Hello! Welcome to our world. Please select action!          |");
        System.out.println("|1. Create a new character                                   |");
        System.out.println("|2. Save game                                                |");
        System.out.println("|3. Load game                                                |");
        System.out.println("|4. Show stats                                               |");
        System.out.println("|5. Exit game                                                |");
        System.out.println("|============================================================|");
        action = scan.nextInt();
        return action;
    }

    private static void raceSelection(Player player) {
        System.out.println("|============================================================|");
        System.out.println("|Please tell us what is your race!                           |");
        System.out.println("|1. Human.                                                   |");
        System.out.println("|2. Elf.                                                     |");
        System.out.println("|3. Orc.                                                     |");
        System.out.println("|============================================================|");

        selectClass = scan.nextInt();
        if (selectClass == 1) {
            player.Human();
        } else if (selectClass == 2) {
            player.Elf();
        } else if (selectClass == 3) {
            player.Orc();
        } else {
            System.out.println("I haven't made this race yet.");
        }
    }

    private static void gameSave() {
        try {
            FileOutputStream fos = new FileOutputStream(new File("playerInfo.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(player);
        } catch (IOException e){
            System.out.println("Error initializing stream");
        }
    }

    private static void gameLoad(){
        try {
            FileInputStream fis = new FileInputStream(new File("playerInfo"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            Player player = (Player) ois.readObject();
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Error initializing stream");
        }
    }
}
