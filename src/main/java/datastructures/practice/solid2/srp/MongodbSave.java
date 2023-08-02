package datastructures.practice.solid2.srp;

public class MongodbSave implements ISaveData {

    @Override
    public UserObject save(String userdata) {
        return new UserObject(userdata, userdata);
    }
}
