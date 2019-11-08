package com.codeinvestigator.springbootmockito.space;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpaceshipPainter {
    private final PainterProperties properties;


    public String paint(){
        return properties.getColor();
    }
}
