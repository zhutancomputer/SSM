package cn.zhutan.ssm.service;

import cn.zhutan.ssm.model.User;

import java.util.List;

public interface IUserService {
    User selectUser(long id);

    List<User> selectAll();

    void insertUser(User user);

    void deleteUser(long id);

    void updateUser(User user);

    User selectByUsername(String username);
}
