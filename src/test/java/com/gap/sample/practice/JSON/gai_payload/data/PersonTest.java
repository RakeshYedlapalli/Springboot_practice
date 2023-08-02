package com.gap.sample.practice.JSON.gai_payload.data;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PersonTest {

    @Test
    public void playTest() {
        Person person = new Person("name", 15);

        Person person1 = Mockito.spy(person);

        Mockito.doReturn(true).when(person1).runInGround("ground");
        boolean s = person.isPlay();;
        //Assert.assertEquals(true, person1.isPlay());
    }
}
