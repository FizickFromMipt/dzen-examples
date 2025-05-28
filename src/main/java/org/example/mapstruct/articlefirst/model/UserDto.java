package org.example.mapstruct.articlefirst.model;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String fullName;
    private boolean active;
}
