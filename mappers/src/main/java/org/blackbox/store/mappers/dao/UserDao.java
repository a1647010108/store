package org.blackbox.store.mappers.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.blackbox.store.beans.entity.User;

public interface UserDao extends BaseMapper<User> {

    public User queryUserByName(String name);
}
