package datastructures.practice.solid2.srp;

import org.springframework.stereotype.Service;


public class StoreDataController {


    ISaveData iSaveData = new NoSqlStorage();
    public UserObject saveData(String dataToBePersisted) {

        return iSaveData.save(dataToBePersisted);

    }

    public static void main(String[] args) {

        new StoreDataController().singleTonClass();
    }
    public void singleTonClass() {

        iSaveData = new NoSqlStorage();
        iSaveData.save("this is no sql db impl");

        iSaveData = new MongodbSave();
        iSaveData.save("This is mongodb db impl");
    }

}

//
