package com.codeinvestigator.springbootmockito.space;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Spaceship {
    private String name;
    private Integer crew;
    private String color;
}
