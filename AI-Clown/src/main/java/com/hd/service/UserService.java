package com.hd.service;


import com.hd.entity.User;

public interface UserService {
    //通过用户id查找用户信息
    public User findUserById(Integer userId);

    //通过用户名称查找用户信息
    public User findUserByUserName(String userName);

    //插入用户
    public int insertUser(User user);

    //修改用户信息
    public void updateUser(User user);

    //删除用户信息
    public void deleteUserById(Integer userId);
}
