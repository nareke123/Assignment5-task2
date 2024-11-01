import java.util.List;

public class UserApp { //controller
    private UserViewModel viewModel;
    private UserView view;

    public UserApp() {
        viewModel = new UserViewModel();
        view = new UserView();
    }

    public static void main(String[] args) {
        UserApp app = new UserApp();
        app.run();
    }

    public void run() {
        while (true) {
            int option = view.showMenu();

            switch (option) {
                case 1:
                    String name = view.getUserInput();
                    viewModel.addUser(name);
                    view.showMessage("User added!");
                    break;
                case 2:
                    List<String> users = viewModel.getUserNames();
                    view.displayUsers(users);
                    break;
                case 3:
                    view.showMessage("Exiting...");
                    view.close();
                    return;
                default:
                    view.showMessage("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
