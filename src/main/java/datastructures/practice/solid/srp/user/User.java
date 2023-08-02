package datastructures.practice.solid.srp.user;

import datastructures.practice.solid.srp.interfaces.IUser;

public class User implements IUser {
    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean register(String username, String password, String email) {
        return false;
    }
}
