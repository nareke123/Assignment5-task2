import java.util.Scanner;
import java.util.List;

public class UserView {// front
    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
    }

    public int showMenu() {
        System.out.println("1. Add user");
        System.out.println("2. Display users");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String getUserInput() {
        scanner.nextLine();
        System.out.print("Enter user name: ");
        return scanner.nextLine();
    }

    public void displayUsers(List<String> users) {
        System.out.println("User List:");
        for (String user : users) {
            System.out.println("- " + user);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void close() {
        scanner.close();
    }

}
