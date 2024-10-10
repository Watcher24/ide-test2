package ch.chm.test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import ch.chm.test.framework.extensions.asteroid.Asteroid;
import ch.chm.test.framework.extensions.asteroid.AsteroidSupport;
import ch.chm.test.framework.extensions.moon.Moon;
import ch.chm.test.framework.extensions.moon.MoonSupport;

@ExtendWith(MoonSupport.class)
@ExtendWith(AsteroidSupport.class)
public class TestUseExtensionsDirectly {

    @Test
    void luminaryTest(Moon moon, Asteroid asteroid) {
        assertNotNull(moon);
        assertNotNull(asteroid);
    }

}
