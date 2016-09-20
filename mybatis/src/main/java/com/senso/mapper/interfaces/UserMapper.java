package com.senso.mapper.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.senso.po.User;

public interface UserMapper {
	
	@Insert("insert into Users(name, age, createdAt) values(#{name}, #{age}, now())")
	public int add(User user);

	@Delete("delete from Users where id=#{id}")
	public int deleteById(int id);
	
	@Update("update Users set name=#{name}, age=#{age} where id=#{id}")
	public int update(User user);
	
	@Select("select * from Users where id=#{id}")
	public User getById(int id);
	
	@Select("select * from Users order by id desc")
	public List<User> getAllUsers();
}
