package io.hackable.test;

import io.hackable.Events;
import org.junit.Test;

public class HackableInSuperClass extends AbstractSample {

    @Test
    public void testEventInSuperClass() {
        sample();
    }

    static {
        Events.on("abstractSample", HackableInSuperClass.class,
                event -> System.out.println(event.allData()));
    }

}
