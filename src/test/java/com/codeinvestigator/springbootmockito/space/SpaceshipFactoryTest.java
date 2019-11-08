package com.codeinvestigator.springbootmockito.space;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
//@RunWith(MocktoJUnitRunner.class)
class SpaceshipFactoryTest {
    @InjectMocks
    SpaceshipFactory spaceshipFactory;

    @Mock
    SpaceshipPainter painter;

    @Test
    void create() {
        when(painter.paint()).thenReturn("white");
        Spaceship spaceship = spaceshipFactory.create();
        System.out.println(String.format("Spaceship %s", spaceship));
        Assertions.assertEquals("white", spaceship.getColor());
    }
}