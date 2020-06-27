import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {

    private static final Scanner scan = new Scanner(System.in);
    public static Player player = new Player();
    private static final String path = "src/playerInfo.txt";
    private static ArrayList<String> charList = new ArrayList<>();

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        int action;

        do {
            action = getAction();
            if (action == 1) {
                raceSelection(player);
            }
            if (action == 2) {
                gameSave();
            }
            if (action == 3) {
                gameLoad();
            }
            if (action == 4) {
                if (player.name == null) {
                    System.out.println("You haven't created/selected a character yet :)");
                } else {
                    player.showClass();
                }
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

        int selectClass = scan.nextInt();
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

    private static void gameSave() throws IOException {
        boolean append = true;
        charList.add(player.toString());
        BufferedWriter writer = new BufferedWriter(new FileWriter(path,append));
        for (String str : charList) {
            writer.write(charList + System.lineSeparator());
        }
        writer.close();
        charList.clear();
    }

    private static void gameLoad() throws IOException, ClassNotFoundException {
        charList.clear();
        BufferedReader reader = new BufferedReader (new FileReader(path));
        while(reader.ready()){
            charList.add(reader.readLine());
        }
        reader.close();
        System.out.println("You have loaded your character " + player.toString());
    }

    public static void characterNaming() {
        System.out.println("What's your name, Traveler?");
        player.name = scan.next();
    }
}
