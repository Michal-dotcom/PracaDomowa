package InternetShop;

public class User {

    private String name;
    private String surname;
    private String login;
    private String password;
    private int ID;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public User() { }

    public User(String name, String surname, String login, String password, int ID) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.ID = ID;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
