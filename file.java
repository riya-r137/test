import java.util.ArrayList;
import java.util.Scanner;

public class file {
    static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> userList = new ArrayList<>();
            
            // Collect 5 user names
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter name for User " + i + ": ");
                String name = scanner.nextLine();
                userList.add(name);
                greet(name);
            }
            
            System.out.println("\nSummary of greeted users:");
            for (String name : userList) {
                System.out.println("- " + name);
            }
        }
    }
}