package users;

import twitter.TwitterUser;

public class MyTwitterUser extends TwitterUser implements User {
    @Override
    public String getEmail() {
        return super.getUserEmail();
    }
}
