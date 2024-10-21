package com.example.datastoremicroservice.web.dto;

import com.example.datastoremicroservice.model.Summary;
import com.example.datastoremicroservice.web.mapper.Mappable;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SummaryMapper extends Mappable<Summary, SummaryDto> {
}
