package io.hexlet.moduls;
import java.util.List;


public class UserFriends {
    private List<UserFriends> friends;

    public List<UserFriends> getUserFriends() {
        return friends;
    }

    public void setUserFriends(List<UserFriends> friends) {
        this.friends = friends;
    }

}
