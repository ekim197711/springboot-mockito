package com.codeinvestigator.springbootmockito.space;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("painter")
@Data
public class PainterProperties {
    private String color;
}
