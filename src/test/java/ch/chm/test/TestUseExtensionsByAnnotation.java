package ch.chm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import ch.chm.test.framework.extensions.OrbTest;
import ch.chm.test.framework.extensions.asteroid.Asteroid;
import ch.chm.test.framework.extensions.moon.Moon;


@OrbTest
public class TestUseExtensionsByAnnotation {

    @Test
    void luminaryTest(Moon moon, Asteroid asteroid) {
        assertNotNull(moon);
        assertNotNull(asteroid);
    }


}
