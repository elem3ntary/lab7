import users.User;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        String email = user.getEmail();
        System.out.println("Sending message:" + text + " to " + email);
        return true;
    }
}
