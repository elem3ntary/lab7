package users;

import facebook.FacebookUser;

public class MyFacebookUser extends FacebookUser implements  User{

    @Override
    public String getCountry() {
        return super.getUserCountry();
    }

    @Override
    public long getLastActiveTime() {
       return super.getUserActiveTime();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }
}
