package datastructures.practice.solid2.srp;

public class NoSqlStorage implements ISaveData {


    @Override
    public UserObject save(String userdata) {
        return new UserObject(userdata, userdata);
    }
}
