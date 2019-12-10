package com.huong.keylog.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.huong.keylog.model.User;

@Repository
public class UserRepository {
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	public int create(User user) {
		String sql = "INSERT INTO users (user_name , pass) VALUES(:userName, :pass);";
		Map<String, Object> maps = new HashMap<String, Object>();
		maps.put("userName", user.getUserName());
		maps.put("pass", user.getPass());
		return jdbcTemplate.update(sql, maps);
	}
}
