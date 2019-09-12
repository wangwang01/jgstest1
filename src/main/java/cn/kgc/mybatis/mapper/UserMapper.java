package cn.kgc.mybatis.mapper;

import cn.kgc.mybatis.bean.User;

import java.util.List;

public interface UserMapper {
    public Integer getUserCount();

    public List<User> getUserList();
}
