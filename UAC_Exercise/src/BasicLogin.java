public class BasicLogin implements ILogin {
    protected String check_username;
    protected String check_password;
    public BasicLogin(String username, String password) {
        this.check_username = username;
        this.check_password = password;
    }

    @Override
    public boolean authenticate(String username, String password){
        return check_username.equals(username) && check_password.equals(password);
    }
}
