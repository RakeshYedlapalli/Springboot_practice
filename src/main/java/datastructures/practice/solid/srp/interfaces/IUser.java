package datastructures.practice.solid.srp.interfaces;

public interface IUser {

    boolean login(String username , String password);
    boolean register(String username , String password , String email);

}
