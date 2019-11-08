package com.codeinvestigator.springbootmockito.space;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpaceshipFactory {
    private final SpaceshipPainter spaceshipPainter;
    public Spaceship create(){
        return new Spaceship("Eagle",
                10,
                spaceshipPainter.paint());
    }
}
