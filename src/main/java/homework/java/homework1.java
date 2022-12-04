package homework.java;
import java.util.Scanner;
public class homework1 {
        public static void main(String[] args) {
            System.out.println("Please enter your name:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Please enter favourite hobby:");
            String favouriteHobby = scanner.nextLine();
            System.out.println("Hi, " + name  + "your favourite hobby  is" + favouriteHobby);

        }

}
