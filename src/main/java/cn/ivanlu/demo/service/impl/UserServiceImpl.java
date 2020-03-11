package cn.ivanlu.demo.service.impl;

import cn.ivanlu.demo.dao.UserDao;
import cn.ivanlu.demo.model.User;
import cn.ivanlu.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
