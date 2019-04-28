package com.xiangyuwenhua.school.entity;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ThermometerMapper {
    int addThermometer(Thermometer thermometer);
}
