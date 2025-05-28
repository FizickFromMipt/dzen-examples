package org.example.mapstruct.articlefirst;

import org.example.mapstruct.articlefirst.model.Gender;
import org.example.mapstruct.articlefirst.model.GenderDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;


@Mapper
public interface GenderMapper {
    @ValueMapping(source = "MALE", target = "M")
    @ValueMapping(source = "FEMALE", target = "F")
    @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "O")
    GenderDto map(Gender gender);
}
