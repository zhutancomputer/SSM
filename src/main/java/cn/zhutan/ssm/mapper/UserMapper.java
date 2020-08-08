package cn.zhutan.ssm.mapper;

import cn.zhutan.ssm.model.User;

import java.util.List;

public interface UserMapper {
    User selectUser(long id);

    List<User> selectAll();

    void insertUser(User user);

    void deleteUser(long id);

    void updateUser(User user);
}
