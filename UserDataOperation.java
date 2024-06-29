package com.bookSystem;
import java.util.*;

public class UserDataOperation {
    private Map<Integer, User> users = new HashMap<>();

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public User getUserById(int userId) {
        return users.get(userId);
    }

    public void updateUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void deleteUser(int userId) {
        users.remove(userId);
    }
}



