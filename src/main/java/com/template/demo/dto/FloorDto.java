package com.template.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class FloorDto {

    private Long id;

    @Range(min = -3, max = 164, message = "asdsd")
    private Integer number;
}
