package com.juno.weatherreport.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.juno.weatherreport.model.User;
@Mapper
@Component
public interface UserMapper {
 
    User Sel(int id);
}