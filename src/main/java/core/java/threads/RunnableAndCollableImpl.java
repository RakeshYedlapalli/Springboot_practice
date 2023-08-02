package core.java.threads;

import core.java.sorting.comparable.Items;

import java.math.BigDecimal;
import java.util.concurrent.Callable;

public class RunnableAndCollableImpl implements Callable {

    @Override
    public Items call() throws Exception {

        return new Items("",new BigDecimal(03.3),30);
    }

    public static void main(String[] args) {

        RunnableAndCollableImpl runnableAndCollable = new RunnableAndCollableImpl();
        //runnableAndCollable.sta


    }
}
