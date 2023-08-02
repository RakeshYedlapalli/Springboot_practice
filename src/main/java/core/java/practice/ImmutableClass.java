package core.java.practice;

import lombok.Getter;

@Getter
public final class ImmutableClass {

    private final int id;
    private final String  name;
    private final Engine engine;



    public ImmutableClass(int id,String name,Engine engine ){

        this.id = id;
        this.name = name;
        Engine engine1 = new Engine(engine.speed);
        this.engine = engine1;
    }


    public static void main(String[] args) {
        Engine e =  new Engine(10);
        ImmutableClass immutableClass = new ImmutableClass(10,"rakesh", e);

        System.out.println(immutableClass.getId());
        System.out.println(immutableClass.getName());
        System.out.println(immutableClass.getEngine());

        e.speed = 100;
        System.out.println(immutableClass.getEngine().speed);
    }
}

class Engine{
    int speed;

    public Engine(int speed){
        this.speed = speed;
    }
}
