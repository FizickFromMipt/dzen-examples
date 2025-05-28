package org.example.mapstruct.articlefirst;

import org.example.mapstruct.articlefirst.model.User;
import org.example.mapstruct.articlefirst.model.UserDto;
import org.mapstruct.*;

@Mapper
public interface UserMapper {

    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "id", target = "id")
    UserDto toDto(User user);

    @InheritInverseConfiguration
    User fromDto(UserDto userDto);

    @InheritConfiguration(name = "toDto")
    UserDto toDtoWithExtra(User user);

    @AfterMapping
    default void setActiveFlag(@MappingTarget UserDto dto, User user) {
        dto.setActive(user.getStatus().equals("ACTIVE"));
    }

    @BeforeMapping
    default void logMapping(User user) {
        System.out.println("Mapping user: " + user.getName());
    }
}