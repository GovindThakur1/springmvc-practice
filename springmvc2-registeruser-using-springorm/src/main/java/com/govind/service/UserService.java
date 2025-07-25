package com.govind.service;

import com.govind.dao.IUserDao;
import com.govind.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final IUserDao userDao;

    @Override
    public void createUser(User user) {
        userDao.saveUser(user);
    }
}
