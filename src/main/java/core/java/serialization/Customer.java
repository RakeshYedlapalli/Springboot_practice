package core.java.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Customer implements Externalizable {

    int id ;
    String name;
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        System.out.println("in writeExternal()");
        out.writeInt(29939393);
        out.writeObject("Rakesh");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        System.out.println("in readExternal()");
        this.id=in.readInt();
        this.name=(String)in.readObject();
    }
}
