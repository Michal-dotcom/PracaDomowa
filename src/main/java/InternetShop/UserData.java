package InternetShop;

import java.util.List;

public class UserData {

    private List<User> userList;


    public void addUser(User user) {
        userList.add(user);
    }

    public List<User> returnListOfUsers() {
        return userList;
    }

    public void removeUser(User user) {

        if (userList.contains(user)) {
            userList.remove(user);
        }
    }

    public User getUserByLogin(String login) {
        if (userList.contains(getUserByLogin(login).getLogin())) {
            return User;
        }
    }

}
