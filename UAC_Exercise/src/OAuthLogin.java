public class OAuthLogin implements ILogin {
    protected String check_token;
    public OAuthLogin(String token) {
        this.check_token = token;
    }

    @Override
    public boolean authenticate(String username, String password){
        return check_token.equals(password);
    }
}
