import java.util.Scanner;

public class mainClass {

    public static final Scanner scan = new Scanner(System.in);
    public static int selectClass = 0;

    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("Hello! Welcome to our world. Please tell us know your class!");
        System.out.println("1. Human.");
        System.out.println("2. Elf.");

        selectClass = scan.nextInt();
        if (selectClass == 1){
            player.Human();
        }
        else if (selectClass == 2){
            player.Elf();
        }
        else if (selectClass == 3){
            player.Orc();
        }
        else {
            System.out.println("I haven't made this class race yet.");
        }

        System.out.println();
        System.out.println();
        player.showClass();
    }
}
