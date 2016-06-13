package com.uacity.admin.mapper;

import com.uacity.admin.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Ted on 16/4/23.
 */
public interface UserMapper {

    //@Select("select `id`, `name`, `age` from `user` where `id` = #{id}")
    User findById(@Param("id") String id );


    //@Insert("insert into user(`name`, `age`) values(#{name}, #{age})")
    void insert( @Param("name") String name, @Param("age") int age );
}
