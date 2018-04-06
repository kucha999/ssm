package cn.sxt.dao;

import java.util.List;

import cn.sxt.entity.User;

public interface UserDao {
	public List<User> selectAll();
}
