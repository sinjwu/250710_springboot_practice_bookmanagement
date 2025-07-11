package com.practice._250710_springboot_practice_bookmanagement.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorDto {
    private Integer id;
    @NotBlank(message = "이름을 입력하세요")
    private String name;
}
