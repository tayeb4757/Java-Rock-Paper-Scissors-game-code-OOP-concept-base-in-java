import java.util.Scanner;
import java.util.Random;

class game2 {
    int n;
    int x;
    int c1 = 0, c2 = 0;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    void user_input() {
        System.out.println("\n0. Rock\n1. Paper\n2. Scissor\n3. Exit");
        System.out.print("Enter your choice : ");
        n = sc.nextInt();

    }

    void computer_choice() {
        x = rand.nextInt(3);
    }

    void show_choice() {
        if (n == 0) {
            System.out.print("You choose Rock & ");
        } else if (n == 1) {
            System.out.print("You choose Paper & ");
        } else if (n == 2) {
            System.out.print("You choose Scissor & ");
        }
        if (x == 0) {
            System.out.print(" Computer choose Rock.\n");
        } else if (x == 1) {
            System.out.print(" Computer choose Paper.\n");
        } else if (x == 2) {
            System.out.print(" Computer choose Scissor.\n");
        }
    }

    void win_cheak() {
        if (n == x) {
            System.out.println("It's a Draw");
        } else if (n == 0 && x == 2 || n == 1 && x == 0 || n == 2 && x == 1) {
            System.out.println("Congratulations You win");
            c1++;
        } else {
            System.out.println("Computer win");
            c2++;
        }
    }

    void display() {
        System.out.println("\n-----Game Over----");
        System.out.println("You win " + c1 + " times.");
        System.out.println("Computer wins " + c2 + " times.");
    }

}

public class rock_paper {
    public static void main(String[] args) {
        game2 g = new game2();
        while (true) {
            g.user_input();
            if (g.n == 3) {
                break;
            } else if (g.n <= 2 && g.n >= 0) {
                g.computer_choice();
                g.show_choice();
                g.win_cheak();
            } else {
                System.out.println("Invalid input");
            }
        }
        g.display();
    }
}
