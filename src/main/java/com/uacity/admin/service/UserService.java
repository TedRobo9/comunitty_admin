package com.uacity.admin.service;

import com.uacity.admin.domain.User;
import com.uacity.admin.mapper.UserMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * Created by Ted on 16/4/23.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    @Async
    public Future<Void> execute() {
        return new AsyncResult<Void>(null);
    }


    @Async
    public Future<User> findOne(String id ) {
        return new AsyncResult<User>(userMapper.findById(id));
    }


    @Async
    public Future<Void> addUser( String name ) {
        userMapper.insert(StringUtils.defaultString(name, "testname"), 10);
        return new AsyncResult<Void>(null);
    }
}
